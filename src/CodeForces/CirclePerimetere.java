package CodeForces;

import java.util.Scanner;

public class CirclePerimetere {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] last={-1};
            long y=solve(0,n,last);
            long ans=8*y-4;
            if(last[0]==0) ans-=4;
            System.out.println(ans);
        }
    }

    private static long solve(long i, long n, int[] last) {
        long ans=0;
        long d=(n*n);
        while(true){
            double calc=Math.pow((i*(i))+d,0.5);
            if(calc<(double)n || calc>=(double)n+1) break;
            ans++;
            i++;
        }
        if(i-1==n) last[0]=0;
        return ans;
    }
}
