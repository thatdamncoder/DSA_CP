package CodeForces;

import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(Math.min(a*n,((n/2)*b + (n%2)*a)));
        }
    }
}
