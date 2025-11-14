package CodeForces;

import java.util.Scanner;

public class SumOfAMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            int[][] b=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j]=sc.nextInt();
                }
            }
            Integer[][] ans=new Integer[n][m];
            rec(0,0,a,b,ans);
            for(Integer[] v:ans){
                for(int u: v){
                    System.out.print(u + " ");
                }
                System.out.println();
            }
        }
    }
    public static void rec(int i,int j,int[][] a,int[][] b,Integer[][] ans){
        if(i<0 || j<0 || i>=a.length || j>=b[0].length) return;
        if(ans[i][j]!=null) return;
        ans[i][j]=a[i][j]+b[i][j];
        rec(i+1,j,a,b,ans);
        rec(i,j+1,a,b,ans);
    }
}
