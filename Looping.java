package javaPractice;
import java.util.*;

public class Looping {
	public static void main(String[] args) {
		
		//palindrome program
		
		String str = "madam";
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
        
        //number pattern program
        
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // factorial program
        
        int m = 5, fact = 1;
        for (int i = 1; i <= m; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
        
        // count digits in a string program
        
        String s = "ab12c34";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) count++;
        }
        System.out.println("Digits = " + count);
        

  }
}


