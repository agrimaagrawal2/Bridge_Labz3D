package Level2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // 2D array: [n][3] → [height, weight, BMI]
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            // Input height
            double height;
            do {
                System.out.print("Enter height in meters (positive): ");
                height = sc.nextDouble();
            } while (height <= 0);

            // Input weight
            double weight;
            do {
                System.out.print("Enter weight in kg (positive): ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            // Calculate BMI
            double bmi = weight / (height * height);

            // Store data in 2D array
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
