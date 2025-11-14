package CodeForces;

import java.util.Scanner;

public class MatrixStabilisation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int max=0;
                    if(i-1>=0) max=Math.max(max,arr[i-1][j]);
                    if(i+1<n)  max=Math.max(max,arr[i+1][j]);
                    if(j-1>=0) max=Math.max(max,arr[i][j-1]);
                    if(j+1<m)  max=Math.max(max,arr[i][j+1]);

                    if(arr[i][j]>max) arr[i][j]=max;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
