package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestCitites {
    static int[] t=new int[100000+1];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int q=sc.nextInt();
            int[][] queries=new int[q][2];
            for (int i = 0; i < q; i++) {
                queries[i][0]=sc.nextInt();
                queries[i][1]=sc.nextInt();
            }
            int[] closest=new int[n];
            closest[0]=1;
            closest[n-1]=n-2;
            for (int i = 1; i + 1 < n; i++) {
                if(Math.abs(arr[i]-arr[i-1])<Math.abs(arr[i]-arr[i+1])){
                    closest[i]=i-1;
                }else {
                    closest[i] = i + 1;
                }
            }
            for (int i = 0; i < q; i++) {
                solve(closest,arr,n,queries[i][0]-1,queries[i][1]-1);
            }
        }
    }
    public static void solve(int[] closest,int[] arr,int n,int s,int e){
        int ans=0;
        if(s<e) {
            while (s!=n-1 && s < e) {
                if (s + 1 != closest[s]) {
                    ans += Math.abs(arr[s] - arr[s + 1]);
                } else {
                    ans += 1;
                }
                s++;
            }
        }
        else {
            while (s!=0 && s > e) {
                if (s - 1 != closest[s]) {
                    ans += Math.abs(arr[s] - arr[s - 1]);
                } else {
                    ans += 1;
                }
                s--;
            }
        }
        System.out.println(ans);
    }
}
