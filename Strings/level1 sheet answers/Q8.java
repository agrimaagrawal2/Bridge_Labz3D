package Level1;

import java.util.Scanner;

public class Q8 {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }

        // generateException(names);
        handleException(names);
        sc.close();
    }
}
