package Question6;

import java.util.ArrayList;

public class DuplicateFinder {

    public static void main(String[] args) {

        // Create ArrayList to store guest names
        ArrayList<String> guests = new ArrayList<>();

        // Add guest names
        guests.add("Ram");
        guests.add("Sita");
        guests.add("Hari");
        guests.add("Ram");
        guests.add("Gita");
        guests.add("Hari");

        // Nested loop to find duplicate names
        for (int i = 0; i < guests.size(); i++) {

            for (int j = i + 1; j < guests.size(); j++) {

                // Check if two names are same
                if (guests.get(i).equals(guests.get(j))) {

                    // Print duplicate name
                    System.out.println("Duplicate name: " + guests.get(i));
                }
            }
        }
    }
}