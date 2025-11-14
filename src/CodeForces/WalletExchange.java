package CodeForces;

import java.util.Scanner;

public class WalletExchange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(Math.abs(a-b)%2!=0) System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}
