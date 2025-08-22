package Level3;
import java.util.Scanner;
public class Q5 {
	 public static void main(String[] args) {
	        int num = new Scanner(System.in).nextInt();
	        int orig = num, sum = 0;
	        while (orig != 0) {
	            int d = orig % 10;
	            sum += d * d * d;
	            orig /= 10;
	        }
	        System.out.println(num + (sum == num ? " is Armstrong" : " is NOT Armstrong"));
	    }
	}


