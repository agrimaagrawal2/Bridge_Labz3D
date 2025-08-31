package Level3;

import java.util.*;

public class StudentMarks {

    // Method to generate random PCM scores
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; // 10–99
            }
        }
        return scores;
    }

    // Method to compute grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);

        System.out.printf("%-8s %-10s %-10s %-10s %-10s %-10s %-10s %-8s\n", 
                          "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            int phy = scores[i][0];
            int chem = scores[i][1];
            int math = scores[i][2];
            int total = phy + chem + math;
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100; // out of 300 marks
            String grade = getGrade(percent);

            System.out.printf("%-8d %-10d %-10d %-10d %-10d %-10.2f %-10.2f %-8s\n",
                              (i + 1), phy, chem, math, total, avg, percent, grade);
        }
    }
}

