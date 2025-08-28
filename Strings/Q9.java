package Level2;

import java.util.Scanner;

public class Q9 {
    static String computerChoice(){
        int val=(int)(Math.random()*3);
        return (val==0)?"rock":(val==1)?"paper":"scissors";
    }

    static String findWinner(String user,String comp){
        if(user.equals(comp)) return "Draw";
        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("scissors") && comp.equals("paper")) return "User";
        if(user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    static void playGames(int n){
        int userWins=0,compWins=0;
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=n;i++){
            System.out.print("Game "+i+" - Enter rock/paper/scissors: ");
            String user=sc.next().toLowerCase();
            String comp=computerChoice();
            String winner=findWinner(user,comp);

            System.out.println("Computer chose: "+comp);
            System.out.println("Winner: "+winner);

            if(winner.equals("User")) userWins++;
            else if(winner.equals("Computer")) compWins++;
        }

        double userPerc=(userWins*100.0)/n;
        double compPerc=(compWins*100.0)/n;

        System.out.println("\n--- Stats ---");
        System.out.println("User Wins: "+userWins+" ("+userPerc+"%)");
        System.out.println("Computer Wins: "+compWins+" ("+compPerc+"%)");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        playGames(n);
        sc.close();
    }
}
