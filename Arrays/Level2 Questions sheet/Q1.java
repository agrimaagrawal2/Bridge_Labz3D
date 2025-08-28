package Level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;

        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;

        // Input loop with validation
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            // Validation
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // repeat this iteration
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Bonus and salary calculation
        for (int i = 0; i < EMP_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5%
            } else {
                bonus[i] = salary[i] * 0.02; // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Bonus Report for Zara ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Summary ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
    }
}
