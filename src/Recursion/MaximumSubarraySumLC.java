package Recursion;

import java.util.Arrays;

public class MaximumSubarraySumLC {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(printkadanesmaxsubarray(arr));
    }
    static int kadanes(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i: arr) {
            sum+=i;
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
    static int printkadanesmaxsubarray(int[] arr){
        int start=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int astart=0;
        int aend=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;
            sum+=arr[i];
           if(sum>max){
                max=sum;
                astart=start;
                aend=i;
            }
            if(sum<0) sum=0;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,astart,aend+1)));
        return max;
    }
}
