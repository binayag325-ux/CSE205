package Question10;

// BankAccount class using encapsulation
public class BankAccount {

    // Private balance field
    private double balance;


    // Constructor to set initial balance
    public BankAccount(double balance) {
        this.balance = balance;
    }


    // Getter method to access balance
    public double getBalance() {
        return balance;
    }


    // Setter method to update balance
    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Method to withdraw money
    public void withdraw(double amount) {

        // Check if amount is valid and enough balance exists
        if (amount > 0 && amount <= balance) {

            // Deduct amount from balance
            balance -= amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn amount: " + amount);
        }

        else {

            // Display error message
            System.out.println("Invalid withdrawal amount.");
        }
    }
}