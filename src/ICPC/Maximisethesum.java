package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class Maximisethesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            long[] b=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
                b[i]=arr[i];
            }
            Arrays.sort(b);
            int i=0;
            int j=n-1;
            int k=0;
            long sum=0;
            while(i<=j){
                arr[k++]=b[i];
                if(i!=j) arr[k++]=b[j];
                i++; j--;
            }
            for (int l = 0; l+1 < n; l+=2) {
                sum+=Math.abs(arr[l]-arr[l+1]);
            }
            System.out.println(sum);
        }
    }
}
