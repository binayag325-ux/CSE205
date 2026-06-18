package Question1;

// ColdBox extends StorageUnit and implements Refrigerated
public class ColdBox extends StorageUnit implements Refrigerated {

    // Temperature of the cold box
    private int temperature;

    // Constructor
    public ColdBox(int id, double capacity) {
        super(id, capacity);
    }

    // Method to adjust temperature
    @Override
    public void adjustTemp(int t) {
        temperature = t;
        System.out.println("Temperature set to " + temperature + "°C");
    }

    // Method to display storage unit details
    @Override
    public void displayDetails() {
        System.out.println("Storage Unit ID: " + id);
        System.out.println("Capacity: " + capacity + " units");
        System.out.println("Temperature: " + temperature + "°C");
    }
}