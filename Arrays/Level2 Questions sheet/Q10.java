package Level2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Convert number to string to count digits
        String numStr = Long.toString(num);
        int length = numStr.length();

        // Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char → int
        }

        // Frequency array for digits 0–9
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " → " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
