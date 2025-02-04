public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        setBalance(this.balance + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            setBalance(this.balance - amount);
        } else {
            System.out.println("not enough money to withdraw");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        /*BankAccount person1 = new BankAccount("Ivanov", 7);
        person1.deposit(6);
        person1.withdraw(9);
        System.out.println(person1.balance);*/
    }
}

