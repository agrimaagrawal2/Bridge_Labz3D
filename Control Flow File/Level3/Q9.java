package Level3;
import java.util.Scanner;
public class Q9 {
	  public static void main(String[] args) {
	        int n = new Scanner(System.in).nextInt(), sum = 0;
	        for (int i = 1; i < n; i++) {
	            if (n % i == 0) sum += i;
	        }
	        System.out.println(n + (sum > n ? " is an Abundant Number" : " is NOT an Abundant Number"));
	    }
	}


