package CodeForces;

import java.util.Scanner;

public class JaggedSwaps {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
             for (int i = 0; i < n; i++) {
                 arr[i]=sc.nextInt();
             }
             for(int i=1;i+1<n;i++){
                 if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                     int temp=arr[i];
                     arr[i]=arr[i+1];
                     arr[i+1]=temp;
                 }
             }
             boolean ok=true;
             for (int i = 0; i< n && ok; i++) {
                 if(arr[i]!=i+1) ok=false;
             }
             System.out.println(ok?"YES":"NO");
         }
     }
}
