package Atcoder;

import java.util.Scanner;

public class ZeroSumGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            long sum=0;
            for (int i = 0; i +1< n; i++) {
                long a=sc.nextLong();
                sum+=a;
            }
            System.out.println(-1*sum);
        }
    }
}
