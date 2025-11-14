package AOALab;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr={3,2,4,-5,1,0,-1};
        msort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void msort(int[] arr,int low,int high){
        if(low>=high) return;
        System.out.println(low+ " " + high);
        int mid=low+(high-low)/2;
        msort(arr,low,mid);
        msort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] ans = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (i = low; i <= high; i++) {
            arr[i] = ans[i - low];
        }
    }
}
