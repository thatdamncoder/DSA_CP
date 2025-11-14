package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeQuert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            int k=sc.nextInt();
            int[][] q=new int[k][3];
            for (int i = 0; i < k; i++) {
                q[i][0]= sc.nextInt();
                q[i][1]= sc.nextInt();
                q[i][2]= sc.nextInt();
            }
            int[] ones=new int[n+1];
            int[] twos=new int[n+1];
            for (int i = 1; i <= n; i++) {
                if(arr[i-1]==2) twos[i]=1+twos[i-1];
                else twos[i]=twos[i-1];
                if(arr[i-1]==1) ones[i]=1+ones[i-1];
                else ones[i]=ones[i-1];
            }
            for (int i = 0; i < k; i++) {
                int end=q[i][1];
                int start=q[i][0];
                int x=q[i][2];
                int o=ones[end]-ones[start-1];
                int t=twos[end]-twos[start-1];
                int l=end-start+1;
                int rem=l-o-t;
                if(t>o) t=(t*o)/(o=t);
                int mod=Math.min(o-t,Math.min(x,rem));
                t+=mod;
                x-=mod;
                rem-=mod;
                if(o==t){
                    x=Math.min(x,rem);
                    o+=(x/2);
                    t+=(x-x/2);
                }
                else{
                    x=Math.min(x,(o-t)/2);
                    o-=x;
                    t+=x;
                }
                System.out.println((long)o*t);
            }
        }
    }
}
