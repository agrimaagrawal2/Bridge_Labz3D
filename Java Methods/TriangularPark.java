package Level1;

import java.util.Scanner;

public class TriangularPark {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        int distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();

        System.out.println("Rounds required: " + calculateRounds(a, b, c));
    }
}
