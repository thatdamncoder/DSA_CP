package Sorting;

import java.util.Arrays;
// Selection sort = find minimum in the right side of the element
//                  swap this element with the minimum element found
//

//				Quadratic time O(n^2)
//				small data set = okay
//				large data set = BAD

public class Selection {
    public static void main(String[] args) {
        int[] arr={2,4,2,5,1,5,1,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void select(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=i;
                }
            }

        }
    }
    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
