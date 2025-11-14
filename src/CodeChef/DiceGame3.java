package CodeChef;

import java.util.Scanner;

public class DiceGame3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            boolean odd=false;
            if(n%2!=0){
                odd=true;
                n--;
            }
            int ans=6*n + (n/2);
            if(!odd) System.out.println(ans);
            else System.out.println(ans+6);
        }
    }
}
