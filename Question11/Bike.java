package Question11;

// Bike class inherits Vehicle
public class Bike extends Vehicle {


    // Constructor
    public Bike(String name, double rate) {
        super(name, rate);
    }


    // Override calculateFee method
    @Override
    public double calculateFee() {

        // Bike rental fee calculation
        return rate * 1.5;
    }
}