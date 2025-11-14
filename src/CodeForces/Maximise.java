package CodeForces;

import java.util.Scanner;

public class Maximise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int ans=1;
            for (int i = 1; i < n; i++) {
                int calc=gcd(i,n)+i;
                if(max<calc){
                    max=calc;
                    ans=i;
                }
            }
            System.out.println(ans);
        }
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
