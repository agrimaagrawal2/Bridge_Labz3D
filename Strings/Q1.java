package Level2;

import java.util.Scanner;

public class Q1 {
    static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int manualLen = customLength(text);
        int builtInLen = text.length();

        System.out.println("Manual Length: " + manualLen);
        System.out.println("Built-in Length: " + builtInLen);
        sc.close();
    }
}
