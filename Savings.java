public class Savings extends Account {
    // Additional attribute specific to Savings account
    private double interestRate;

    // Constructor
    public Savings(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);  // calling the Account constructor
        this.interestRate = interestRate;  // setting the interest rate
    }

    // Getter
    public double getInterestRate() {
        return interestRate;  // returns the interest rate
    }

    // Setters
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;  // allows updating of interest rate
    }

    // Implementing deposit method
    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);  // adds the deposit amount to the current balance
    }

    // Implementing withdraw method
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {  // check if there are enough funds to withdraw
            setBalance(getBalance() - amount);  // subtract the withdrawal amount
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
