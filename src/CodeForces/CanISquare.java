package CodeForces;

import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int t = sc.nextInt();
            long n = 0L;
            for (int i = 0; i < t; i++) {
                n += (long) sc.nextInt();
            }
            //easy way
//            long sqrt=(long)Math.sqrt((double)n);
//            if(n-(sqrt*sqrt)==0) System.out.println("YES");
//            else System.out.println("NO");
            if (isPerfect(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    //binary search
    private static boolean isPerfect(long n) {
        if(n==1) return true;
        long start=1;
        long end=n/2;
        double mid;
        while(start<=end){
            mid=(double)(start+(end-start)/2);
            if(mid*mid==n){
                return true;
            }
            if(mid*mid<n){
                start=(long)mid+1;
            }
            else if(mid*mid>n){
                end=(long)mid-1;
            }
        }
        return false;
    }
}
