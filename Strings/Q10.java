package Level2;

import java.util.*;

public class Q10 {

    // Method to generate random 2-digit PCM scores for n students
    static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; // random 10–99
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            // round off to 2 digits
            avg = Math.round(avg * 100.0) / 100.0;
            perc = Math.round(perc * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = perc;
        }
        return stats;
    }

    // Method to assign grades based on percentage
    static String[] assignGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double perc = stats[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method to display scorecard
    static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\n--- Student Scorecard ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-6s\n",
                "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade", "");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-12s\n",
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate scores
        int[][] scores = generateScores(n);

        // Calculate stats
        double[][] stats = calculateStats(scores);

        // Assign grades
        String[] grades = assignGrades(stats);

        // Display results
        displayScorecard(scores, stats, grades);

        sc.close();
    }
}
