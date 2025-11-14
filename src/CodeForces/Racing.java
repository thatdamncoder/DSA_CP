package CodeForces;

import java.util.Scanner;

public class Racing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n = sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int[][] cor=new int[n][2];
            for (int i = 0; i < n; i++) {
                cor[i][0]=sc.nextInt();
                cor[i][1]=sc.nextInt();
            }
            boolean ans=rec(0,0,arr,cor);
            if(!ans) System.out.println(-1);
            else{
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean rec(int i,int h,int[] arr,int[][] cor){
        if(i>=arr.length) return true;

        if(arr[i]!=-1){
            int nexth=h+arr[i];
            if(cor[i][0]<=(nexth) && (nexth)<=cor[i][1]) {
                return rec(i+1,nexth,arr,cor);
            }
            return false;
        } else{
            arr[i]=0;
            int nexth=h+arr[i];
            boolean ok=false;
            if(cor[i][0]<=(nexth) && (nexth)<=cor[i][1]) {
                ok=rec(i+1,nexth,arr,cor);
            }
            if(ok) return true;
            arr[i]=1;
            nexth=h+arr[i];
            if(cor[i][0]<=(nexth) && (nexth)<=cor[i][1]) {
                return rec(i+1,nexth,arr,cor);
            }
            arr[i]=-1;
            return false;
        }
    }
}
