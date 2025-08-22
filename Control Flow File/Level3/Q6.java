package Level3;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(), count = 0;
        if (num == 0) count = 1;
        else while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}


