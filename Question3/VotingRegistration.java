package Question3;

public class VotingRegistration {

    // Method to check voting eligibility
    public static void checkEligibility(int age) throws InvalidAgeException {

        // Check if age is less than required age
        if (age < 18) {

            // Throw custom exception
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        }

        // If age is valid
        System.out.println("Eligible for voting registration.");
    }


    public static void main(String[] args) {

        // Test age value
        int age = 16;

        try {

            // Call method
            checkEligibility(age);

        }
        catch (InvalidAgeException e) {

            // Handle exception
            System.out.println("Exception: " + e.getMessage());
        }
    }
}