package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class InhabitantOftheDeepSea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            int i=0;
            int j=n-1;
            long ans=0;
            while(i<n && j>=0 && i<=j && k>0){
//                System.out.println(Arrays.toString(arr));
                if(i==j){
                    if(arr[i]<=k) ans++;
                    break;
                }
                long min=Math.min(arr[i],arr[j]);
                long d=min*2;
                if(min>k) break;
                else if(d>k){
                    if(arr[i]==min) arr[i]-=min;
                    k-=min;
                }
                else{
                    arr[i]-=min;
                    arr[j]-=min;
                    k-=d;
                }
                if(arr[i]<=0) {
                    ans++;
                }
                if(arr[j]<=0){
                    ans++;
                }
                if(arr[i]<=0) i++;
                if(arr[j]<=0) j--;
            }
//            System.out.println(Arrays.toString(arr));
            System.out.println(ans);
        }
    }
}
