package CodeForces;

import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int w=sc.nextInt();
            int[] wei=new int[n];
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                wei[i]=sc.nextInt();
                arr[i]=sc.nextInt();
            }
            System.out.println(rec(0,w,arr,wei));
        }
    }

    private static int rec(int i, int w, int[] arr,int[] wei) {
        if(w<=0) return 0;
        if(i>=arr.length) return 0;
        int take=0;
        if(wei[i]<=w) take=arr[i]+rec(i+1,w-wei[i],arr,wei);
        int leave=rec(i+1,w,arr,wei);
        return Math.max(take,leave);
    }
}
