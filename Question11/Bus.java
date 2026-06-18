package Question11;

// Bus class inherits Vehicle
public class Bus extends Vehicle {


    // Constructor
    public Bus(String name, double rate) {
        super(name, rate);
    }


    // Override calculateFee method
    @Override
    public double calculateFee() {

        // Bus rental fee calculation
        return rate * 3;
    }
}