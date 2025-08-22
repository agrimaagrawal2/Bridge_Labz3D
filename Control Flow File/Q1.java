package Level2;
import java.util.*;
public class Q1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        if (number >= 1) {
	            for (int i = 1; i <= number; i++) {
	                System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
	            }
	        } else {
	            System.out.println("Not a natural number.");
	        }
	    }
	}


	
