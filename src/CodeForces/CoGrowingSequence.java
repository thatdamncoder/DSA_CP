package CodeForces;

import java.util.Scanner;

public class CoGrowingSequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int[] ans=new int[n];
            ans[0]=0;
            for (int i = 1; i < n; i++) {
                if(((arr[i]&arr[i-1])!=arr[i-1])){
                    ans[i]=arr[i] ^ (arr[i] | arr[i-1]);
                    arr[i]=arr[i]^ans[i];
                }
                else ans[i]=0;

            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
