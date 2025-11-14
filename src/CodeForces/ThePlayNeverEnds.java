package CodeForces;

import java.util.Scanner;

public class ThePlayNeverEnds {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            boolean ok=(n-1)%3==0;
            System.out.println(ok?"YES":"NO");
        }
    }
}
