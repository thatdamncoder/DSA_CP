package Sorting;

import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int[] arr={2,2,3,1,4,5,2,6,7,2,8,4};
        counting(arr);
    }
    public static void counting(int[] arr){
        int max=arr[0];
        int n=arr.length;
        for (int k : arr) {
            max = Math.max(max, k);
        }
        int[] count=new int[max+1];
        for (int k : arr) {
            count[k]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1]; //prefixsumarray
        }
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[--count[arr[i]]]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
