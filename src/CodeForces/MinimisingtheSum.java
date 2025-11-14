package CodeForces;

import java.util.Scanner;

public class MinimisingtheSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            Long[][] t=new Long[n+1][k+1];
            System.out.println(rec(0,k,arr,t));
        }
    }
    public static long rec(int i,int k,int[] arr,Long[][] t){
        if(i>=arr.length) return 0;
        if(k<0) return Long.MAX_VALUE;
        if(t[i][k]!=null) return t[i][k];

        long min=Long.MAX_VALUE;
        long currMin=Long.MAX_VALUE;
        int op=0;
        for(int j=i;j<arr.length && op<=k;j++){
            currMin=Math.min(currMin,arr[j]);
            long ans=rec(j+1,k-op,arr,t);
            if(ans!=Long.MAX_VALUE) ans+=(j-i+1)*currMin;
            min=Math.min(min,ans);
            op++;
        }
        return t[i][k]=min;
    }
}
