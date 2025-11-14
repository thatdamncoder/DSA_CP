package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class JellyFishAndBabysBreatb {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] p=new int[n];
            int[] q=new int[n];
            for (int i = 0; i < n; i++) {
                p[i]= sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                q[i]= sc.nextInt();
            }
            long[] r=new long[n];
            long mod=998244353;
            int[] pp=new int[n];
            int[] pq=new int[n];
            pp[0]=0;
            pq[0]=0;
            int max=Math.max(p[0],q[0]);
            for (int i = 1; i < n; i++) {
                pp[i]=pp[i-1];
                if(p[i] > p[pp[i-1]]) {
                    pp[i]=i;
                }
                pq[i]=pq[i-1];
                if(q[i] > q[pq[i-1]]) {
                    pq[i]=i;
                }
                max=Math.max(max,p[i]);
                max=Math.max(max,q[i]);
            }

            long[] power=new long[max+1];
            power[0]=1;
            for (int i = 1; i <=max ; i++) {
                power[i]=(power[i-1]%mod * 2)%mod;
            }

            for (int i = 0; i < n; i++) {
                long m1=(power[p[pp[i]]]%mod + power[q[i-pp[i]]]%mod) % mod;
                long m2=(power[q[pq[i]]]%mod + power[p[i-pq[i]]]%mod) % mod;
                r[i]=Math.max(m1,m2)%mod;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(r[i] + " ");
            }
            System.out.println();
        }
    }
}
