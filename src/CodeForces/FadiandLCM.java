package CodeForces;

import java.util.Scanner;

public class FadiandLCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            long n=sc.nextLong();
            long a=1;
            long b=n;
            long min=Long.MAX_VALUE;
            for (int i = 2; (long) i *i <=n ; i++) {
                if(n%i==0 && i!=n/i && lcm(i,n/i)==n){
                    if(Math.max(i,n/i)<min){
                        min=Math.max(i,n/i);
                        a=i;
                        b=n/i;
                    }
                }
            }
            System.out.println(a + " " + b);

        }
    }
    public static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    public static long gcd(long a,long b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
