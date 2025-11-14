package CodeForces;

import java.util.Scanner;

public class MaximumPathSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(rec(0,0,arr));
        }
    }
    public static long rec(int i,int j,int[][] arr){
        if(i==arr.length-1 && j==arr[0].length-1) return arr[i][j];
        if(i<0 || j<0 || i>=arr.length && j>=arr[0].length) return 0;
        long down=Integer.MIN_VALUE;
        if(i+1<arr.length) down=arr[i][j]+rec(i+1,j,arr);
        long right=Integer.MIN_VALUE;
        if(j+1<arr[0].length) right=arr[i][j]+rec(i,j+1,arr);
        return Math.max(right,down);
    }
}
