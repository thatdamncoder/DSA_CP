package Atcoder;

import java.math.BigInteger;
import java.util.Scanner;

public class HappyNewYear2023 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(!computed) seive();
        while(num--!=0){
            BigInteger n=sc.nextBigInteger();
            System.out.println();

        }
    }
    static boolean[] notprime=new boolean[10000];
    static boolean computed=false;
    private static void seive(){
        computed=true;
        notprime[0]=true;
        notprime[1]=true;
        int n=100000;
        for (int i = 2; i*i <= n; i++) {
            if(!notprime[i]){
                for (int j = i*i; j <=n ; j+=i) {
                    notprime[j]=true;
                }
            }
        }
    }
//    public void search(BigInteger n){
//        for (int i = 2; i*i<=10000; i++) {
//            if(!notprime[n/i]){
//                BigInteger a=n/i;
//                double sq=Math.sqrt(n);
//                if(sq*sq==n && !notprime(sq)){
//                    System.out.println(sq + " " i);
//                    return;
//                }
//            }
//        }
//
//    }
}
