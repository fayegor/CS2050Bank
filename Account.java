public abstract class Account {
    // Attributes
    private String accountNumber; // unique number for the account
    private double balance;       // amount of money in the account

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;  // setting the account number
        this.balance = balance;  // setting the initial balance
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;  // returns the account number
    }

    public double getBalance() {
        return balance;  // returns the balance
    }

    // Setters
    public void setBalance(double balance) {
        this.balance = balance;  // allows balance to be updated
    }

    // Abstract methods that must be implemented in subclasses
    public abstract void deposit(double amount);  // how to add money
    public abstract void withdraw(double amount); // how to remove money
}
