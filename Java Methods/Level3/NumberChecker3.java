package Level3;

import java.util.*;

public class NumberChecker3 {

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverse(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        return compareArrays(digits, reverse(digits));
    }

    public static boolean isDuck(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 1221;
        System.out.println("Number: " + number);
        System.out.println("Palindrome? " + isPalindrome(number));
        System.out.println("Duck? " + isDuck(number));
    }
}
