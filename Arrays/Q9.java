package Level2;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks of Physics, Chemistry, Maths
        int[][] marks = new int[n][3];   // row = student, col = subject
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Physics
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Invalid! Enter positive value.");
                i--; 
                continue;
            }

            // Chemistry
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Invalid! Enter positive value.");
                i--;
                continue;
            }

            // Maths
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Invalid! Enter positive value.");
                i--;
                continue;
            }

            // Calculate percentage using 2D array values
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Determine grade
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // Display report  ✅ (this was incomplete before)
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-6s%n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-6s%n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}

