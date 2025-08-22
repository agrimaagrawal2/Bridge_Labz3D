package Level2;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to power " + power + " is " + result);
    }
}


