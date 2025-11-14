package Recursion;

import StacksandQueues.P02_Stack_CustomStack;
import StacksandQueues.P05_Queue_CircularQueue;

import java.util.Arrays;

public class P08_Recursion_QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int middle=start + (end-start)/2;
        int pivot=arr[middle];

        //putting pivot at correct place
        while(start<=end) {
            while (arr[start] < pivot) {
                start++;
            }
            while(arr[end] > pivot) {
                end--;
            }

            //again checking for violation since 'while' check will only execute when entire body of loop is finished
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        //now pivot is at correct position, sort individual halves
        //start is now > end
        //sequence is  low end start high
        quicksort(arr,low,end);
        quicksort(arr,start,high);
    }
}
