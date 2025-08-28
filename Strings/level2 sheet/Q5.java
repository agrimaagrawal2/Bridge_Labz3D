package Level2;

import java.util.Scanner;

public class Q5 {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVowelsConsonants(String text) {
        int vowels=0,cons=0;
        for (int i=0;i<text.length();i++) {
            String type=checkChar(text.charAt(i));
            if(type.equals("Vowel")) vowels++;
            else if(type.equals("Consonant")) cons++;
        }
        return new int[]{vowels,cons};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        int[] counts=countVowelsConsonants(text);
        System.out.println("Vowels: "+counts[0]);
        System.out.println("Consonants: "+counts[1]);
        sc.close();
    }
}
