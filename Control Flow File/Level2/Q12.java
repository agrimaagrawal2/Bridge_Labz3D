package Level2;
import java.util.Scanner;
public class Q12 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        int counter = 100;
	        if (number > 0 && number < 100) {
	            while (counter >= 1) {
	                if (counter % number == 0)
	                    System.out.println(counter);
	                counter--;
	            }
	        } else {
	            System.out.println("Enter a positive number less than 100");
	        }
	    }
	}


