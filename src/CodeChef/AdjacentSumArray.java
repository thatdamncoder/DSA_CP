package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacentSumArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n-1];
            for (int i = 0; i < n-1; i++) {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int[] ans=new int[n];
            ans[0]=1;
            for (int i = 0; i < n-1; i++) {
                ans[i+1]=arr[i]-ans[i];
            }
            for (int i = 0; i <n ; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
