package Atcoder;

import java.util.Scanner;

public class Buildings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int ans=-1;
            for (int i = 1; i < n; i++) {
                if(arr[i]>arr[0]){
                    ans=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
