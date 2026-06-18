package Question1;

// Main class to test the program
public class Main {

    public static void main(String[] args) {

        // Create a ColdBox object
        ColdBox box = new ColdBox(101, 250.5);

        // Adjust temperature
        box.adjustTemp(-10);

        // Display details
        box.displayDetails();
    }
}
