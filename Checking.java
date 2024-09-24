public class Checking extends Account {
    // Additional attribute for overdraft limit
    private double overdraftLimit;

    // Constructor
    public Checking(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);  // calling the Account constructor
        this.overdraftLimit = overdraftLimit;  // setting the overdraft limit
    }

    // Getter
    public double getOverdraftLimit() {
        return overdraftLimit;  // returns the overdraft limit
    }

    // Setter
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;  // allows updating the overdraft limit
    }

    // Implementing deposit method
    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);  // adds the deposit amount to the current balance
    }

    // Implementing withdraw method
    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {  // allows overdraft up to the limit
            setBalance(getBalance() - amount);  // subtract the withdrawal amount
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
