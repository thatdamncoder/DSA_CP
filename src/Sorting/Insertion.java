package Sorting;

import java.util.Arrays;
/*
 Insertion sort = after comparing elements to the left,
					shift elements to the right to make room to insert a value

					Quadratic time O(n^2)
					small data set = decent
					large data set = BAD

					Lesser steps than Bubble sort
					Best case is O(n) compared to Selection sort O(n^2)
 */
public class Insertion {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[i]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void insertionsort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            //insert element to the place created
            arr[j+1]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
