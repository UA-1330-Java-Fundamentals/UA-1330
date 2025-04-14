package com.softserve.edu.final_project;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleBankingSystem {
    private static final String BIN = "400000";
    private static final Random random = new Random();
    private static Connection conn;

    public static void main(String[] args) {
        String fileName = getFileName(args);
        connectToDatabase(fileName);
        createTableIfNotExists();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Create an account");
            System.out.println("2. Log into account");
            System.out.println("0. Exit");
            System.out.print("> ");

            switch (scanner.nextLine()) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    logIntoAccount(scanner);
                    break;
                case "0":
                    System.out.println("\nBye!");
                    running = false;
                    break;
            }
        }

        closeDatabase();
    }

    private static String getFileName(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if ("-fileName".equals(args[i])) {
                return args[i + 1];
            }
        }
        return "default.s3db";
    }

    private static void connectToDatabase(String fileName) {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
        } catch (SQLException e) {
            System.out.println("\nDatabase connection failed.");
            e.printStackTrace();
        }
    }

    private static void createTableIfNotExists() {
        String sql = """
                CREATE TABLE IF NOT EXISTS card (
                    id INTEGER PRIMARY KEY,
                    number TEXT,
                    pin TEXT,
                    balance INTEGER DEFAULT 0
                );
                """;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createAccount() {
        String cardNumber = generateCardNumber();
        String pin = String.format("%04d", random.nextInt(10000));

        String sql = "INSERT INTO card (number, pin, balance) VALUES (?, ?, 0)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cardNumber);
            pstmt.setString(2, pin);
            pstmt.executeUpdate();
            System.out.println("\nYour card has been created!");
            System.out.print("\nYour card number: ");
            System.out.println(cardNumber);
            System.out.print("Your card PIN: ");
            System.out.println(pin);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static String generateCardNumber() {
        StringBuilder number = new StringBuilder(BIN);
        for (int i = 0; i < 9; i++) {
            number.append(random.nextInt(10));
        }
        int checksum = calculateLuhnChecksum(number.toString());
        number.append(checksum);
        return number.toString();
    }

    private static int calculateLuhnChecksum(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (i % 2 == 0) digit *= 2;
            if (digit > 9) digit -= 9;
            sum += digit;
        }
        return (10 - (sum % 10)) % 10;
    }

    private static void logIntoAccount(Scanner scanner) {
        System.out.println("\nEnter your card number:");
        String cardNumber = scanner.nextLine();
        System.out.println("Enter your PIN:");
        String pin = scanner.nextLine();

        String sql = "SELECT * FROM card WHERE number = ? AND pin = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cardNumber);
            pstmt.setString(2, pin);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("\nYou have successfully logged in!");
                showAccountMenu(scanner, cardNumber);
            } else {
                System.out.println("\nWrong card number or PIN!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showAccountMenu(Scanner scanner, String cardNumber) {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n1. Balance");
            System.out.println("2. Add income");
            System.out.println("3. Do transfer");
            System.out.println("4. Close account");
            System.out.println("5. Log out");
            System.out.println("0. Exit");
            System.out.print("> ");

            switch (scanner.nextLine()) {
                case "1":
                    showBalance(cardNumber);
                    break;
                case "2":
                    addIncome(scanner, cardNumber);
                    break;
                case "3":
                    doTransfer(scanner, cardNumber);
                    break;
                case "4":
                    closeAccount(cardNumber);
                    loggedIn = false;
                    break;
                case "5":
                    System.out.println("\nYou have successfully logged out!");
                    loggedIn = false;
                    break;
                case "0":
                    System.out.println("\nBye!");
                    System.exit(0);
            }
        }
    }

    private static void showBalance(String cardNumber) {
        String sql = "SELECT balance FROM card WHERE number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cardNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("\nBalance: " + rs.getInt("balance"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addIncome(Scanner scanner, String cardNumber) {
        System.out.println("\nEnter income:");
        int income = Integer.parseInt(scanner.nextLine());
        String sql = "UPDATE card SET balance = balance + ? WHERE number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, income);
            pstmt.setString(2, cardNumber);
            pstmt.executeUpdate();
            System.out.println("\nIncome was added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void doTransfer(Scanner scanner, String senderCard) {
        System.out.println("\nEnter card number:");
        String receiverCard = scanner.nextLine();

        if (senderCard.equals(receiverCard)) {
            System.out.println("\nYou can't transfer money to the same account!");
            return;
        }

        if (!luhnCheck(receiverCard)) {
            System.out.println("\nProbably you made a mistake in the card number. Please try again!");
            return;
        }

        if (!cardExists(receiverCard)) {
            System.out.println("\nSuch a card does not exist.");
            return;
        }

        System.out.println("Enter how much money you want to transfer:");
        int amount = Integer.parseInt(scanner.nextLine());

        if (!hasEnoughMoney(senderCard, amount)) {
            System.out.println("\nNot enough money!");
            return;
        }

        try {
            conn.setAutoCommit(false);
            updateBalance(senderCard, -amount);
            updateBalance(receiverCard, amount);
            conn.commit();
            System.out.println("\nSuccess!");
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("\nTransfer failed.");
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean luhnCheck(String cardNumber) {
        int sum = 0;
        for (int i = 0; i < cardNumber.length() - 1; i++) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            if (i % 2 == 0) digit *= 2;
            if (digit > 9) digit -= 9;
            sum += digit;
        }
        int checksum = (10 - (sum % 10)) % 10;
        return checksum == Character.getNumericValue(cardNumber.charAt(cardNumber.length() - 1));
    }

    private static boolean cardExists(String cardNumber) {
        String sql = "SELECT 1 FROM card WHERE number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cardNumber);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean hasEnoughMoney(String cardNumber, int amount) {
        String sql = "SELECT balance FROM card WHERE number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cardNumber);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() && rs.getInt("balance") >= amount;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void updateBalance(String cardNumber, int amount) throws SQLException {
        String sql = "UPDATE card SET balance = balance + ? WHERE number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, amount);
            pstmt.setString(2, cardNumber);
            pstmt.executeUpdate();
        }
    }

    private static void closeAccount(String cardNumber) {
        String sql = "DELETE FROM card WHERE number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cardNumber);
            pstmt.executeUpdate();
            System.out.println("\nThe account has been closed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeDatabase() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}