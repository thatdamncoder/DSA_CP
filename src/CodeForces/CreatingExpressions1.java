package CodeForces;

import java.util.Scanner;

public class CreatingExpressions1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            long sum=sc.nextLong();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println(rec(1,sum-arr[0],arr)?"YES":"NO");
        }
    }
    private static boolean rec(int i,long sum,int[] arr){
        if(i>=arr.length) return sum==0;
        return (
                rec(i+1,sum+arr[i],arr) ||
                rec(i+1,sum-arr[i],arr)
        );
    }
}
