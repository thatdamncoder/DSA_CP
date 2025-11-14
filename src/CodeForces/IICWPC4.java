package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class IICWPC4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int pairs=n*(n-1)/2;
            int[] sums=new int[pairs];
            int index=0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    sums[index++]=arr[i]+arr[j];
                }
            }
            Arrays.sort(sums);
            long count = 0;
            for (int k = 0; k < sums.length; k++) {
                for (int i = 0; i < k; i++) {
                    //bs template
                    int left = i, right = k-1;
                    int pos = i-1;
                    while (left <= right) {
                        int mid = (left + right) / 2;
                        if (sums[i] + sums[mid] < sums[k]) {
                            pos = mid;
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                    if (pos >= i) count += pos - i + 1;
                }
            }
            double ans= (double) count /(n*n*n);
            System.out.println(ans);
        }
    }
}
