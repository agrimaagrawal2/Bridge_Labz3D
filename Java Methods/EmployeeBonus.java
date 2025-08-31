package Level3;

import java.util.*;

public class EmployeeBonus {

    // Method to generate salaries & years of service
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // col0 = salary, col1 = years
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary
            data[i][1] = rand.nextInt(11); // years of service: 0–10
        }
        return data;
    }

    // Method to calculate new salary & bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] newData = new double[data.length][2]; 
        // col0 = bonus, col1 = new salary

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            newData[i][0] = bonus;
            newData[i][1] = newSalary;
        }
        return newData;
    }

    // Method to print tabular report
    public static void printReport(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-12s %-12s\n", 
                "ID", "OldSal", "Years", "Bonus", "NewSalary", "Bonus%");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int oldSal = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][0];
            double newSal = newData[i][1];

            totalOld += oldSal;
            totalBonus += bonus;
            totalNew += newSal;

            double bonusPercent = (years > 5) ? 5 : 2;

            System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f %-12.0f%%\n",
                    (i + 1), oldSal, years, bonus, newSal, bonusPercent);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("TOTAL  %-10.2f %-10s %-10.2f %-12.2f\n", 
                totalOld, "", totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int n = 10;

        // Generate employee data
        int[][] employees = generateEmployeeData(n);

        // Calculate bonus & new salaries
        double[][] updated = calculateBonus(employees);

        // Print Report
        printReport(employees, updated);
    }
}
