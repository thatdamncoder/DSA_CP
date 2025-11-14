package Maths;

import java.util.Scanner;

public class MatrixExponentiation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(helper(num));
    }
    public static int helper(int n){
        int[][] init={ {1,1},
                       {1,0} };
        int[][] ans=exponentiate(init,n);
        return ans[0][1];
    }
    public static int[][] exponentiate(int[][] arr,int n){
        if(n==0){
            return new int[][]{{1,0},{0,1}};
        }
        if(n==1) return arr;
        int[][] temp=exponentiate(arr,n/2);
        temp=multiply(temp,temp);
        
        if((n&1)==1) temp=multiply(temp,arr);
        return temp;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int[][] res=new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return res;
    }
}
