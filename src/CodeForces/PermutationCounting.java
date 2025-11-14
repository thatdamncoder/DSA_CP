package CodeForces;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationCounting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long k=sc.nextInt();
            int[] arr=new int[n];
            long min=Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                min=Math.min(min,arr[i]);
            }
            Arrays.sort(arr);
            min=arr[0];
            if(min!=n){
                if(k<n-min){
                    System.out.println(0);
                    continue;
                }
                else {
                    k-=(n-min);
                    arr[0]=n;
                    min=n;
                }
            }
            long count=min;
            for (int i = 0; i < n; i++) {
                arr[i]-=min;
                if(arr[i]<=0) break;
            }

//            for (int i = n-1; i >=0 && k>0; i--) {
//                if(arr[i]<n && k-(n-arr[i])>=0) {
//                    k-=(n-arr[i]);
//                    count++;
//                }
//            }
            System.out.println(count + (n-1)*(count-1));
        }
    }
}
