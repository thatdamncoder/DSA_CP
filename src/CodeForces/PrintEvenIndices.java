package CodeForces;

import java.util.Scanner;

public class PrintEvenIndices {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
//            int[] arr=new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i]=sc.nextInt();
//            }
//            rec(5);
            System.out.println(_3nplus1(n));
        }
    }
    public static void rec(int i,int[] arr){
        if(i>=arr.length) return;
        rec(i+2,arr);
        System.out.print(arr[i] + " ");
    }
    public static long rec(int n){
        if(n<=1) return 1;
        return n*rec(n-1);
    }
    public static int _3nplus1(int n){
        if(n==1) return 1;
        int calc=0;
        if(n%2!=0) calc=1+_3nplus1(3*n+1);
        else calc=1+ _3nplus1(n/2);
        return calc;
    }
//    public static long sum(int i,int j,int[][] arr){
//        if(i>0 || j<0 || i>=arr.length || j>=arr[0].length) return 0;
//        System.out.println()
//        return (long)arr[i][j] + sum(i+1,j,arr) + sum(i-1,j,arr) + sum(i,j+1,arr) + sum(i,j-1,arr);
//    }
}
