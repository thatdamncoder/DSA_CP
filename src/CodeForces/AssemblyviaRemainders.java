package CodeForces;

import java.util.Scanner;

public class AssemblyviaRemainders {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n-1];
            for (int i = 0; i < n-1; i++) {
                arr[i]= sc.nextInt();
            }
            int[] newarr=new int[n];
            newarr[0]=arr[0]+1;
            newarr[1]=arr[0];
            for (int i = 2; i < n; i++) {
                if(arr[i-1]>=newarr[i-1]){
                    int ceil=arr[i-1]/newarr[i-2]+1;
                    newarr[i-1]=(ceil)*(newarr[i-2])+arr[i-2];
                }
                newarr[i]=arr[i-1];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(newarr[i] + " ");
            }
            System.out.println();
        }
    }
}
