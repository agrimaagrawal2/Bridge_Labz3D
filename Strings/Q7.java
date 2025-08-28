package Level2;

import java.util.Scanner;

public class Q7 {
    static int[] trimBounds(String text){
        int start=0,end=text.length()-1;
        while(start<=end && text.charAt(start)==' ') start++;
        while(end>=start && text.charAt(end)==' ') end--;
        return new int[]{start,end+1};
    }

    static String customSubstring(String text,int start,int end){
        String res="";
        for(int i=start;i<end;i++) res+=text.charAt(i);
        return res;
    }

    static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text=sc.nextLine();

        int[] bounds=trimBounds(text);
        String manual=customSubstring(text,bounds[0],bounds[1]);
        String builtIn=text.trim();

        System.out.println("Manual: ["+manual+"]");
        System.out.println("Built-in: ["+builtIn+"]");
        System.out.println("Equal? "+compareStrings(manual,builtIn));
        sc.close();
    }
}

