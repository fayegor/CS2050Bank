    // Main method to test outputs
public class Main {
    public static void main(String[] args) {
        // Create a Savings account
        Savings savingsAccount = new Savings("SAV123", 1000.0, 0.02);  // account with $1000 balance and 2% interest
        System.out.println("Savings Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + savingsAccount.getBalance());

        // Deposit money into the savings account
        savingsAccount.deposit(500);
        System.out.println("Balance after deposit of $500: $" + savingsAccount.getBalance());

        // Withdraw money from the savings account
        savingsAccount.withdraw(300);
        System.out.println("Balance after withdrawal of $300: $" + savingsAccount.getBalance());

        // Try to withdraw more than the balance
        savingsAccount.withdraw(1500);
        System.out.println("Balance after failed withdrawal: $" + savingsAccount.getBalance());

        // Create a Checking account
        Checking checkingAccount = new Checking("CHK456", 500.0, 200.0);  // account with $500 balance and $200 overdraft limit
        System.out.println("\nChecking Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + checkingAccount.getBalance());

        // Deposit money into the checking account
        checkingAccount.deposit(100);
        System.out.println("Balance after deposit of $100: $" + checkingAccount.getBalance());

        // Withdraw money from the checking account within the overdraft limit
        checkingAccount.withdraw(700);
        System.out.println("Balance after withdrawal of $700: $" + checkingAccount.getBalance());

        // Try to exceed the overdraft limit
        checkingAccount.withdraw(200);
        System.out.println("Balance after failed withdrawal: $" + checkingAccount.getBalance());
