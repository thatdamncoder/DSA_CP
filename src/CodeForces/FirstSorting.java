package CodeForces;

import java.util.Scanner;

public class FirstSorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m= sc.nextInt();
            System.out.println(Math.min(n,m) + " " + Math.max(n,m)) ;
        }
    }
}
