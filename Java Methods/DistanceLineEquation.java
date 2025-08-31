package Level3;

import java.util.Scanner;

public class DistanceLineEquation {

    // Method to compute Euclidean distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to compute slope and intercept of line
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double[] result = new double[2]; // result[0] = slope (m), result[1] = intercept (b)

        if (x2 == x1) {
            System.out.println("The line is vertical, slope is undefined!");
            return null;
        }

        double m = (double)(y2 - y1) / (x2 - x1);  // slope
        double b = y1 - m * x1;                    // intercept

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Euclidean distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        if (line != null) {
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        }
    }
}
