package Atcoder;

import java.util.Scanner;

public class ExponentialPlant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int count=0;
            int i=1;
            while(i-1<=n){
                i=(i<<1);
                count++;
            }
            System.out.println(count);
        }
    }
}
