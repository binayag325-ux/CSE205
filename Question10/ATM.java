package Question10;

public class ATM {

    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount(5000);


        // Display current balance
        System.out.println("Current Balance: "
                + account.getBalance());


        // Try to withdraw money
        account.withdraw(2000);


        // Display updated balance
        System.out.println("Remaining Balance: "
                + account.getBalance());


        // Try invalid withdrawal
        account.withdraw(6000);
    }
}
