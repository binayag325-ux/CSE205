package Question9;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class LogFileReader {

    public static void main(String[] args) {

        // Create ArrayList to store error messages
        ArrayList<String> errorLogs = new ArrayList<>();

        try {

            // Open server.log file
            File file = new File("server.log");

            // Create Scanner to read file
            Scanner sc = new Scanner(file);

            // Read file line by line
            while (sc.hasNextLine()) {

                // Store current line
                String line = sc.nextLine();

                // Check if line contains ERROR
                if (line.contains("ERROR")) {

                    // Add error line to ArrayList
                    errorLogs.add(line);
                }
            }

            // Close scanner
            sc.close();


            // Display stored error logs
            System.out.println("Error Logs:");

            for (String error : errorLogs) {
                System.out.println(error);
            }

        }

        // Handle file not found error
        catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}