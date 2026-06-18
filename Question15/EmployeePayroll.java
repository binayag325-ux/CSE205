package Question15;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class EmployeePayroll {

    public static void main(String[] args) {


        // Create ArrayList to store employees
        ArrayList<Employee> staff = new ArrayList<>();


        // Add employees
        staff.add(new FullTime("Ram", 50000));
        staff.add(new Contractor("Sita", 1000, 40));


        try {

            // Create file writer
            FileWriter file = new FileWriter("payroll_report.txt");

            // Create buffered writer
            BufferedWriter writer = new BufferedWriter(file);


            // Loop through employees
            for (Employee e : staff) {


                // Calculate employee pay
                double pay = e.calculatePay();


                // Create report line
                String report = e.name +
                        " Salary: " + pay;


                // Write data into file
                writer.write(report);

                // Move to next line
                writer.newLine();


                // Display output
                System.out.println(report);
            }


            // Close writer
            writer.close();


            System.out.println("Payroll report exported successfully.");

        }

        catch (IOException e) {

            // Handle file error
            System.out.println("Error writing payroll file.");
        }
    }
}