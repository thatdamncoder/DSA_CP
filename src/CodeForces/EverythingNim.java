package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class EverythingNim {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long sum=0;
            Arrays.sort(arr);
            for (int i = 0; i + 1<n ; i++) {
                sum+=arr[i+1]-arr[i];
            }
            System.out.println((sum==0 || sum%2!=0)?"Alice":"Bob");
        }
    }
}
