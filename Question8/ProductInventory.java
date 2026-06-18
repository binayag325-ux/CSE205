package Question8;

public class ProductInventory {

    public static void main(String[] args) {

        // Create array of Electronics objects
        Electronics[] inventory = new Electronics[3];

        // Store products in array
        inventory[0] = new Electronics("Laptop", 80000);
        inventory[1] = new Electronics("Mobile", 50000);
        inventory[2] = new Electronics("Tablet", 30000);


        // Apply 10% discount to all products
        for (Electronics e : inventory) {

            e.applyDiscount(10.0);
        }
    }
}