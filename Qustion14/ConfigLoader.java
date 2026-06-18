package Qustion14;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class ConfigLoader {


    // Method to read config file
    public static void readConfig() throws FileNotFoundException {

        // Open config file
        File file = new File("config.txt");

        // Scanner reads file content
        Scanner sc = new Scanner(file);

        System.out.println("Config file found.");

        // Read and display configuration
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        // Close scanner
        sc.close();
    }


    // Method to create default config file
    public static void createDefaultConfig() {

        try {

            // Create new config file
            FileWriter writer = new FileWriter("config.txt");


            // Write default values
            writer.write("username=admin");
            writer.write("\nmode=default");
            writer.write("\nversion=1.0");


            // Close writer
            writer.close();


            System.out.println("Default config file created.");

        }

        catch (IOException e) {

            System.out.println("Error while creating file.");
        }
    }



    public static void main(String[] args) {


        try {

            // Try to read config file
            readConfig();

        }

        catch (FileNotFoundException e) {

            // If file does not exist, create default file
            createDefaultConfig();
        }

    }
}