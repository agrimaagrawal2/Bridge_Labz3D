package Level3;
import java.util.Scanner;
public class Q1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int year = sc.nextInt();

	        if (year >= 1582) {
	            if (year % 4 == 0) {
	                if (year % 100 == 0) {
	                    if (year % 400 == 0) {
	                        System.out.println("The year " + year + " is a Leap Year.");
	                    } else {
	                        System.out.println("The year " + year + " is NOT a Leap Year.");
	                    }
	                } else {
	                    System.out.println("The year " + year + " is a Leap Year.");
	                }
	            } else {
	                System.out.println("The year " + year + " is NOT a Leap Year.");
	            }
	        } else {
	            System.out.println("Leap Year check is only valid for year >= 1582.");
	        }
	    }
	}


