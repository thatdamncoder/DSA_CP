package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            long ones=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]==1) ones++;
            }
            Arrays.sort(arr);
            long s=arr[n-1];
            int mod=1000000007;
            for(int i=n-2;i>=0;i--){
                if(arr[i]>1 || s>1) s=((s%mod)*(arr[i]%mod))%mod;
                else s=((s%mod)+(arr[i]%mod))%mod;
            }
            System.out.println(s%mod);
        }

    }
    public static long rec(int i,int[] arr){
        if(i==arr.length-1) return arr[i];
        long recurse= rec(i+1,arr);
        return Math.max(recurse*arr[i],recurse+arr[i]);
    }
}
