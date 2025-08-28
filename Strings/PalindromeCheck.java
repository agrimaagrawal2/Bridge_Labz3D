package Level3;

import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1
    public static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2 (Recursion)
    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    // Logic 3 (Reverse and Compare)
    public static boolean isPalindrome3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reverse[i] = text.charAt(original.length - 1 - i);
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Palindrome (Logic 1): " + isPalindrome1(text));
        System.out.println("Palindrome (Logic 2): " + isPalindrome2(text, 0, text.length() - 1));
        System.out.println("Palindrome (Logic 3): " + isPalindrome3(text));
    }
}
