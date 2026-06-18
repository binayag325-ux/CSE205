package Question12;

public class SurveyAnalyzer {

    public static void main(String[] args) {

        // Array to store 50 survey responses
        int[] responses = {
                1, 2, 3, 4, 5,
                2, 3, 1, 4, 5,
                3, 3, 2, 5, 4,
                1, 2, 4, 5, 3,
                5, 4, 2, 1, 3,
                2, 3, 5, 4, 1,
                4, 5, 3, 2, 1,
                3, 4, 2, 5, 1,
                1, 3, 4, 5, 2,
                5, 2, 4, 3, 1
        };


        // Frequency array to count ratings (1 to 5)
        // Index 0 is unused
        int[] freq = new int[6];


        // Count each response
        for (int r : responses) {

            // Increase count of rating
            freq[r]++;
        }


        // Display frequency of each rating
        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Rating " + i + " : " + freq[i] + " times"
            );
        }
    }
}