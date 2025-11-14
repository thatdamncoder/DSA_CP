package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class TPrime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                long sqrt= (long) Math.sqrt(arr[i]);
                if(sqrt==Math.sqrt(arr[i]) && isPrime(sqrt)) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
    private static boolean isPrime(long n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
//        if((n-1)%6==0 || (n+1)%6==0) return true;
        for (int i = 5; (long) i *i <=n ; i+=6) {
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }

}
//999966000289