package Level2;

import java.util.Scanner;

public class Q6 {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c)!=-1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] classifyChars(String text) {
        String[][] result=new String[text.length()][2];
        for (int i=0;i<text.length();i++) {
            result[i][0]=String.valueOf(text.charAt(i));
            result[i][1]=checkChar(text.charAt(i));
        }
        return result;
    }

    static void display2D(String[][] arr){
        System.out.println("Char\tType");
        for(String[] row:arr){
            System.out.println(row[0]+"\t"+row[1]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        String[][] result=classifyChars(text);
        display2D(result);
        sc.close();
    }
}
