package Level3;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + (isPrime ? " is Prime" : " is NOT Prime"));
    }


}
