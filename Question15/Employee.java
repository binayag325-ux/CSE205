package Question15;

// Parent class for employees
public class Employee {

    // Common employee details
    protected String name;
    protected double salary;


    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    // Method to calculate pay
    public double calculatePay() {
        return salary;
    }
}
