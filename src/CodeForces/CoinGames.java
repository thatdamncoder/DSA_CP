package CodeForces;

import java.util.Scanner;

public class CoinGames {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='U') c++;
            }
            System.out.println(c%2!=0?"YES":"NO");
        }
    }
}
