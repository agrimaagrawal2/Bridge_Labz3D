package Level1;
import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, i = 1;
        if(n > 0) {
            while(i <= n) sum += i++;
            int formula = n*(n+1)/2;
            System.out.println("Loop sum: " + sum + ", Formula sum: " + formula);
        } else System.out.println("Not a natural number");
    }
}
