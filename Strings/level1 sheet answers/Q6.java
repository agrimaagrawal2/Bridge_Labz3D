package Level1;

import java.util.Scanner;

public class Q6 {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // invalid indices
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
        sc.close();
    }
}
