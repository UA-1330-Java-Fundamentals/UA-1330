package homework3;
/*
Create a public class called BankAccount with two private fields:
accountNumber  String type and balance double type.
Implement a constructor for the class that takes an account number
and an initial balance as parameters and initializes the corresponding fields.
Implement setter methods for both fields: setAccountNumber and setBalance.
Implement getter method for balance field: getBalance.

Modify the code of the previous task for the Bank Account class and implement methods:
1) deposit method void type that adds a specified amount of money to the account.
This method should take the deposit amount as a parameter and add it to the current balance.
2) withdraw method void type that allows withdrawing a specified amount of money from the account.
This method should check if there are sufficient funds in the account for the withdrawal
and deduct the specified amount from the balance.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }
    public void withdraw(double withdrawalAmount){
        if ( withdrawalAmount > balance){
            System.out.println("Not enough money on balance");
        }
        balance -= withdrawalAmount;

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
