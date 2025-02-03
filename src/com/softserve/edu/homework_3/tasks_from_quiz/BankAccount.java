package com.softserve.edu.homework_3.tasks_from_quiz;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double deposit) {
        balance += deposit;
    }

    public void withdraw (double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal denied. Not enough funds on the balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " was successful. Remaining balance is " + balance);
        }
    }
}
