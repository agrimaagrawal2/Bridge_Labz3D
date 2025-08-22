package Level3;
import java.util.*;
public class Q3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input marks
	        System.out.print("Enter marks in Physics: ");
	        int physics = sc.nextInt();
	        System.out.print("Enter marks in Chemistry: ");
	        int chemistry = sc.nextInt();
	        System.out.print("Enter marks in Maths: ");
	        int maths = sc.nextInt();

	        // Calculate total and percentage
	        int total = physics + chemistry + maths;
	        double percentage = total / 3.0;

	        String grade = "";
	        String remarks = "";

	        // Assign grade and remarks based on percentage
	        if (percentage >= 80) {
	            grade = "A";
	            remarks = "(Level 4, above agency-normalized standards)";
	        } else if (percentage >= 70) {
	            grade = "B";
	            remarks = "(Level 3, at agency-normalized standards)";
	        } else if (percentage >= 60) {
	            grade = "C";
	            remarks = "(Level 2, below but approaching agency-normalized standards)";
	        } else if (percentage >= 50) {
	            grade = "D";
	            remarks = "(Level 1, well below agency-normalized standards)";
	        } else if (percentage >= 40) {
	            grade = "E";
	            remarks = "(Level 1-, too below agency-normalized standards)";
	        } else {
	            grade = "R";
	            remarks = "(Remedial standard(s))";
	        }

	        // Output
	        System.out.println("\n--- Result ---");
	        System.out.println("Average Percentage: " + percentage + "%");
	        System.out.println("Grade: " + grade);
	        System.out.println("Remarks: " + remarks);

	        sc.close();
	    }
	}


