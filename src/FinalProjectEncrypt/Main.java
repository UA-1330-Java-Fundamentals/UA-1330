package FinalProjectEncrypt;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String cipherType = prompt("Please, enter the cipher type (caesar or xor): ");
        String operation = prompt("Please, enter the target operation (enc or dec): ");
        int key = promptInt("Please, enter the int key (between 0...25): ");

        FileManager fm = new FileManager();
        String content = fm.read("files/input.txt");

        String result = processCipher(cipherType, operation, content, key);
        if (result != null) {
            fm.write("files/output.txt", result);
            System.out.println("Result: " + result);
        } else {
            System.out.println("An error occurred. Please check your input.");
        }

        SCANNER.close();
    }

    private static String processCipher(String type, String operation, String data, int key) {
        switch (type) {
            case "caesar":
                CaesarCipher caesar = new CaesarCipher();
                return operation.equals("dec") ? caesar.decrypt(data, key) : caesar.encrypt(data, key);
            case "xor":
                XorCipher xor = new XorCipher();
                return operation.equals("dec") ? xor.decrypt(data, key) : xor.encrypt(data, key);
            default:
                System.out.println("Unknown cipher type.");
                return null;
        }
    }

    private static String prompt(String message) {
        System.out.println(message);
        return inputReaderString();
    }

    private static int promptInt(String message) {
        System.out.println(message);
        return inputReaderInt();
    }

    public static String inputReaderString() {
        try {
            return SCANNER.nextLine().trim().toLowerCase();
        } catch (Exception e) {
            throw new RuntimeException("Wrong input string");
        }
    }

    public static int inputReaderInt() {
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Wrong input integer");
        }
    }
}
