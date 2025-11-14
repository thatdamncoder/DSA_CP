package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class ChessForThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=3;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            long sum=a+b+c;
            if(sum%2!=0) System.out.println(-1);
            else{
                System.out.println(Math.min(b,c)+Math.min(a,c-b));
            }

        }
    }
}
