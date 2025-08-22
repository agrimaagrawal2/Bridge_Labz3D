package Level3;
import java.util.*;
public class Q7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        String status = "";

        // Decide status based on BMI table
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output
        System.out.println("\n--- BMI Result ---");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);

        sc.close();
    }


}
