package Level2;

import java.util.Random;

public class Q8 {
    static int[] generateAges(int n){
        Random rand=new Random();
        int[] ages=new int[n];
        for(int i=0;i<n;i++) ages[i]=rand.nextInt(90); // 0–89
        return ages;
    }

    static String[][] canVote(int[] ages){
        String[][] result=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            result[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0) result[i][1]="false";
            else if(ages[i]>=18) result[i][1]="true";
            else result[i][1]="false";
        }
        return result;
    }

    static void display2D(String[][] arr){
        System.out.println("Age\tCan Vote?");
        for(String[] row:arr) System.out.println(row[0]+"\t"+row[1]);
    }

    public static void main(String[] args){
        int[] ages=generateAges(10);
        String[][] report=canVote(ages);
        display2D(report);
    }
}
