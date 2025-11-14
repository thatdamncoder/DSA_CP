package CodeForces;

import java.util.Scanner;
import java.util.Spliterator;

public class Rudolfandtheticket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            //bruteforce
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i]=sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i]=sc.nextInt();
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr1[i]+arr2[j]<=k) count++;
                }
            }
            System.out.println(count);
        }
    }
}
