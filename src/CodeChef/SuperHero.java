package CodeChef;

import java.util.Scanner;

public class SuperHero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long m=n*(k%2==0?k:k-1);
            System.out.println(rec(m));
        }
    }
    public static long rec(long n){
        if(n%2==0){
            return 1+rec(n/2);
        }
        for (long i = 2; i*i<=n;i++) {
            if(n%i==0) {
                return 1+rec(n/i);
            }
        }
        return 1;
    }
}
