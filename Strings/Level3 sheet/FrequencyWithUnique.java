package Level3;

import java.util.Scanner;

public class FrequencyWithUnique {

    // Reuse unique method
    public static char[] findUnique(String text) {
        char[] arr = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) arr[index++] = ch;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = arr[i];
        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = findUnique(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println("    " + row[0] + "      |     " + row[1]);
        }
    }
}
