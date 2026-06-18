package Question11;

import java.util.ArrayList;

public class VehicleFleet {

    public static void main(String[] args) {


        // Create ArrayList to store vehicles
        ArrayList<Vehicle> fleet = new ArrayList<>();


        // Add different vehicle objects
        fleet.add(new Bike("Yamaha Bike", 1000));
        fleet.add(new Bus("Tour Bus", 5000));


        // Loop through vehicles
        for (Vehicle v : fleet) {

            // Polymorphism calls different calculateFee()
            System.out.println(
                    v.name + " Rental Fee: " + v.calculateFee()
            );
        }
    }
}
