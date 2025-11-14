package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            int[] prefix=new int[n+1];
            int sum=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            Arrays.sort(arr);
            for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }
            for (int i = 1; i <=n; i++) {
                prefix[i]=prefix[i-1]+arr[i-1];
            }
            int ans=Integer.MIN_VALUE;
            for (int i = 0; i<n && i<k; i++) {
                int neg=prefix[Math.min(n,i+x)]-prefix[i];
                ans=Math.max(ans,sum-2*neg);
                sum-=arr[i];
            }
            System.out.println(ans);
        }
    }
}
