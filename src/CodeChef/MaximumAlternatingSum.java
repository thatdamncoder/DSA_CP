package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAlternatingSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int minus=n/2;
            Arrays.sort(arr);
            long sum=0;
            for (int i = 0; i < n; i++) {
                if(minus!=0){
                    sum-=arr[i];
                    minus--;
                }
                else sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
