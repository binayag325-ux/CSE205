package Question2;

import java.util.ArrayList;

public class StudentGradeFilter {

    public static void main(String[] args) {

        // Create an ArrayList to store exam scores
        ArrayList<Integer> scores = new ArrayList<>();

        // Add some sample scores
        scores.add(95);
        scores.add(82);
        scores.add(38);
        scores.add(91);
        scores.add(67);
        scores.add(25);
        scores.add(40);

        // Loop through each score
        for (int score : scores) {

            // Check if the score is Distinction
            if (score >= 90) {
                System.out.println(score + " : Distinction");
            }

            // Check if the score is Pass
            else if (score >= 40) {
                System.out.println(score + " : Pass");
            }

            // Otherwise, the student has failed
            else {
                System.out.println(score + " : Fail");
            }
        }
    }
}