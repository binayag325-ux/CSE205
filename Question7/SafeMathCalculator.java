package Question7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeMathCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        try {

            // Take two integer inputs from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Perform division
            int result = a / b;

            // Display result
            System.out.println("Result = " + result);

        }

        // Handle division by zero error
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Handle invalid input error
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        }

        // Close scanner
        sc.close();
    }
}