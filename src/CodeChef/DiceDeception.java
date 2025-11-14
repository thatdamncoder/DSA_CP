package CodeChef;

import java.util.Scanner;
import java.util.Arrays;

public class DiceDeception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long sum=0;
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if(k==0){
                System.out.println(sum);
                continue;
            }
            Arrays.sort(arr);
            for (int i = 0; i < n && k>0; i++) {
                if(arr[i]<7-arr[i]){
                    sum+=7-arr[i];
                    sum-=arr[i];
                    k--;
                }
            }
            System.out.println(sum);
        }
    }
}
