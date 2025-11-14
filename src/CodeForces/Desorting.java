package CodeForces;

import java.util.Scanner;

public class Desorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int min=Integer.MAX_VALUE;
            int s=0;
            int e=0;
            boolean sorted=true;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(i-1>=0) sorted=arr[i-1]<=arr[i];
                if(i-1>=0) {
                    if(arr[i]-arr[i-1]<min){
                        min=arr[i]-arr[i-1];
                        s=arr[i-1];
                        e=arr[i];
                    }
                }
            }
            if(!sorted){
                System.out.println(0);
                continue;
            }
            System.out.println(min+1);

        }
    }
}
