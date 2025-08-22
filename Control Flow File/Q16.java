package Level1;
import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
    }
}
