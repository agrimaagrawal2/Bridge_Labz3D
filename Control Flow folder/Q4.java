package Level1;
import java.util.*;
public class Q4 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        if(n >= 1)
	            System.out.println("The sum of " + n + " natural numbers is " + (n * (n + 1) / 2));
	        else
	            System.out.println("The number " + n + " is not a natural number");
	    }
	}


