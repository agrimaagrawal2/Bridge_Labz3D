package Level2;

import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3]; // weight, height, BMI
        String[] status = new String[10];

        // Input data for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();

            // calculate BMI
            members[i][2] = calculateBMI(members[i][0], members[i][1]);
            // calculate status
            status[i] = getStatus(members[i][2]);
        }

        // Display results
        System.out.println("\n--- Team BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    members[i][0], members[i][1], members[i][2], status[i]);
        }
    }
}
