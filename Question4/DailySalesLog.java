package Question4;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class DailySalesLog {

    public static void main(String[] args) {

        // Array to store 7 days of sales
        double[] sales = {2500.50, 3200.75, 1800.25, 4000.00,
                2750.40, 3500.60, 5000.00};

        try {

            // Create FileWriter and BufferedWriter
            FileWriter file = new FileWriter("weekly_sales.txt");
            BufferedWriter writer = new BufferedWriter(file);

            // Write each sales value into file
            for (double amount : sales) {

                // Write sales amount
                writer.write(String.valueOf(amount));

                // Move to next line
                writer.newLine();
            }

            // Close writer
            writer.close();

            System.out.println("Sales data saved successfully.");

        }
        catch (IOException e) {

            // Handle file error
            System.out.println("An error occurred while writing file.");
        }
    }
}