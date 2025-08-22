package Level3;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), sum = 0, temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(n + (n % sum == 0 ? " is a Harshad Number" : " is NOT a Harshad Number"));
    }
}


