package CodeForces;

import java.util.Scanner;

public class GrassHopperonAline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();

            System.out.println(solve(n,k));
        }

    }
    public static long solve(int n,int k){
        if(n<=0) return Integer.MAX_VALUE-1;
        long min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            long take=0;
            if(i%k!=0){
                min=Math.min(min,1+solve(n-i,k));
            }
        }
        return min;
    }
}
