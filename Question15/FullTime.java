package Question15;

// FullTime employee inherits Employee
public class FullTime extends Employee {


    // Constructor
    public FullTime(String name, double salary) {
        super(name, salary);
    }


    // Override calculatePay method
    @Override
    public double calculatePay() {

        // Full time employee gets fixed salary
        return salary;
    }
}