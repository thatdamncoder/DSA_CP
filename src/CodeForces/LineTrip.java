package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt()+1;
            int d=sc.nextInt();
            int max=0;
            int[] arr=new int[n];
            for (int i = 1; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 1; i< n; i++) {
                max=Math.max(max,arr[i]-arr[i-1]);
            }
            System.out.println(Math.max(max,(d-arr[n-1])*2));
        }
    }
}
