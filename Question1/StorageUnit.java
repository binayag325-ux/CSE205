package Question1;

// Abstract class for storage units
public abstract class StorageUnit {

    // Storage unit ID and capacity
    protected int id;
    protected double capacity;

    // Constructor to initialize values
    public StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}