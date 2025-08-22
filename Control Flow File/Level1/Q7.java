package Level1;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
        System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");
    }
}
