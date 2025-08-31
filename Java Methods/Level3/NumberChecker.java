package Level3;

import java.util.*;

public class NumberChecker {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int pow = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, pow);
        return sum == n;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Duck? " + isDuck(number));
        System.out.println("Armstrong? " + isArmstrong(number));
        System.out.println("Largest & 2nd Largest: " + Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println("Smallest & 2nd Smallest: " + Arrays.toString(smallestAndSecondSmallest(digits)));
    }
}
