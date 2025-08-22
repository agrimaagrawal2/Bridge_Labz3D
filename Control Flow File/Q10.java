package Level3;
import java.util.Scanner;
public class Q10 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double a = sc.nextDouble(), b = sc.nextDouble();
	        String op = sc.next();
	        switch (op) {
	            case "+": System.out.println("Result: " + (a + b)); break;
	            case "-": System.out.println("Result: " + (a - b)); break;
	            case "*": System.out.println("Result: " + (a * b)); break;
	            case "/": 
	                if (b != 0) System.out.println("Result: " + (a / b));
	                else System.out.println("Cannot divide by zero");
	                break;
	            default: System.out.println("Invalid Operator");
	        }
	    }
	}


