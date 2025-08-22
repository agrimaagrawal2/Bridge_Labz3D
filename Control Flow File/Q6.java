package Level2;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age and height of Amar: ");
        int age1 = sc.nextInt(); double h1 = sc.nextDouble();
        System.out.print("Enter age and height of Akbar: ");
        int age2 = sc.nextInt(); double h2 = sc.nextDouble();
        System.out.print("Enter age and height of Anthony: ");
        int age3 = sc.nextInt(); double h3 = sc.nextDouble();

        if (age1 <= age2 && age1 <= age3) System.out.println("Amar is the youngest.");
        else if (age2 <= age1 && age2 <= age3) System.out.println("Akbar is the youngest.");
        else System.out.println("Anthony is the youngest.");

        if (h1 >= h2 && h1 >= h3) System.out.println("Amar is the tallest.");
        else if (h2 >= h1 && h2 >= h3) System.out.println("Akbar is the tallest.");
        else System.out.println("Anthony is the tallest.");
    }
}


