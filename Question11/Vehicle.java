package Question11;

// Parent class for all vehicles
public class Vehicle {

    // Common vehicle details
    protected String name;
    protected double rate;


    // Constructor
    public Vehicle(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }


    // Method to calculate rental fee
    public double calculateFee() {
        return rate;
    }
}