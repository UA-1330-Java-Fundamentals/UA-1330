package com.softserve.edu;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double depositToBalance) {
            this.balance += depositToBalance;
        }

        public void withdraw(double withdrawFromBalance) {
            if(withdrawFromBalance > this.balance) {
                this.balance -= withdrawFromBalance;
            }
            else {
                System.out.println("Insufficient balance");
            }
        }

}
