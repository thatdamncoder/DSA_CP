package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class TooMinTooMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int a=arr[n-1];
            int b=arr[0];
            int c=arr[n-2];
            int d=arr[1];
            System.out.println(Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-d)+Math.abs(d-a));
        }
    }
}
