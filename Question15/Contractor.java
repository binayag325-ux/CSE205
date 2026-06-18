package Question15;

// Contractor employee inherits Employee
public class Contractor extends Employee {

    // Working hours
    private int hours;


    // Constructor
    public Contractor(String name, double salary, int hours) {
        super(name, salary);
        this.hours = hours;
    }


    // Override calculatePay method
    @Override
    public double calculatePay() {

        // Contractor pay based on hours
        return salary * hours;
    }
}