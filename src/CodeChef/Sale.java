package CodeChef;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int max=0;
            int maxindex=0;
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int[] prefix=new int[n+1];
            prefix[0]=0;
            for (int i = 1; i <= n; i++) {
                if(arr[i-1]>max){
                    max=arr[i-1];
                    maxindex=i;
                }
                prefix[i]=prefix[i-1]+arr[i-1];
            }
            max=0;
            for (int i = 1; i <= n; i++) {
                max=Math.max(max,prefix[i]+arr[i-1]);
            }
            System.out.println(max);
        }
    }
}
