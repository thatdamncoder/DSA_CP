package Recursion;
import java.awt.*;
import java.util.Arrays;
import static java.lang.System.arraycopy;
import static java.lang.System.setOut;

public class P07_Recursion_MergeSort {

    public static void main(String[] args) {
//        int[] arr={3,2,4,1};
////        int[] ans=mergesort(arr);
////        System.out.println(Arrays.toString(ans));
//        mergesortInPlace(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        String[][] arr1= {{"a","0549"},{"b","0457"},{"a","0532"},{"a","0621"},{"b","0540"}};
//        for (String[] a: arr1) {
//            Arrays.sort(a);
//        }
//        for (String[] a: arr1) {
//            System.out.println(Arrays.toString(a));
//        }



//        List<List<String>> list1=[["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        //creating
        int[] firsthalf=mergesort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] secondhalf=mergesort(Arrays.copyOfRange(arr,arr.length/2,arr.length));
        return merge(firsthalf,secondhalf);
    }
    static int[] merge(int[] first, int[] second){
        int[] combined= new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                combined[k]=first[i];
                i++;
                k++;
           }
            else{
                combined[k]=second[j];
                j++;
                k++;
            }
        }

        //if one of the arrays is not complete traversing
        while(i<first.length){
            combined[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            combined[k]=second[j];
            j++;
            k++;
        }
        return combined;
    }


    //Sorting in place:-without returning new arrays after sorting
    static void mergesortInPlace(int[] arr,int start,int end){
        if(start>=end) {
            return;
        }
        int middle=(start+end)/2;
        mergesortInPlace(arr,start,middle);
        mergesortInPlace(arr,middle+1,end);
        mergeInPlace(arr,start,middle,end);
    }
    static void mergeInPlace(int[] arr, int start, int middle,int end) {
        //correct code
        int[] mix = new int[end - start + 1];

        int i = start;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= end) {

            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
                k++;
            } else {
                mix[k] = arr[j];
                j++;
                k++;
            }
        }

        // copy the remaining elements from the first subarray
        while (i <= middle) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // copy the remaining elements from the second subarray
        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // copy the 'mix' array back into the 'arr' array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
    static int mergexor(int[] arr, int start, int middle,int end) {
        int max=Integer.MIN_VALUE;
        int[] mix = new int[end - start + 1];

        int i = start;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= end) {

            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
                k++;
            } else {
                mix[k] = arr[j];
                j++;
                k++;
            }
        }

        // copy the remaining elements from the first subarray
        while (i <= middle) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // copy the remaining elements from the second subarray
        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // copy the 'mix' array back into the 'arr' array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
        return 0;
    }


}
