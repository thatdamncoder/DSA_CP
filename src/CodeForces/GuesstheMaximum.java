package CodeForces;

import java.util.Scanner;

public class GuesstheMaximum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            long min=Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                min=Math.min(min,Math.max(arr[i],arr[i-1]));
            }
            System.out.println(min-1);
        }
    }
}
