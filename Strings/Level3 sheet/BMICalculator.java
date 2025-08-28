package Level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meter
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return array of Height, Weight, BMI, Status
        return new String[]{
            String.format("%.2f", heightCm), 
            String.format("%.2f", weight),
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to process all members
    public static String[][] processBMI(double[][] hwArray) {
        String[][] result = new String[hwArray.length][4];
        for (int i = 0; i < hwArray.length; i++) {
            result[i] = calculateBMI(hwArray[i][0], hwArray[i][1]);
        }
        return result;
    }

    // Method to display in tabular format
    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hwArray = new double[10][2]; // [10 persons][weight, height]

        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            hwArray[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            hwArray[i][1] = sc.nextDouble();
        }

        // Process
        String[][] result = processBMI(hwArray);

        // Display
        display(result);

        sc.close();
    }
}
