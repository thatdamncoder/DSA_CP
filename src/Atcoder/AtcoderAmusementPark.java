package Atcoder;

import java.util.Scanner;

public class AtcoderAmusementPark {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            long ans=1;
            long curr=arr[0];
            for (int i = 1; i < n; i++) {
                if(curr+arr[i]<=k){
                    curr+=arr[i];
                }
                else{
                    ans++;
                    curr=arr[i];
                }
            }
            System.out.println(ans);
        }
    }
}
