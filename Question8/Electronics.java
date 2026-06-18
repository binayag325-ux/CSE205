package Question8;

// Electronics class implements Discountable interface
public class Electronics implements Discountable {

    // Product details
    private String name;
    private double price;

    // Constructor
    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Implement applyDiscount method
    @Override
    public void applyDiscount(double pct) {

        // Calculate discount amount
        double discount = price * pct / 100;

        // Reduce price after discount
        price = price - discount;

        System.out.println(name + " price after "
                + pct + "% discount: " + price);
    }
}