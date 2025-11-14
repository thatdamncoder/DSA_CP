package Recursion;

import java.util.Arrays;

public class P06_Recursion_SelectionSort{
    public static void main(String[] args) {
        int[] arr={4,3,-2,5,0};
        selectionsort(arr,0);
        selectionmethod2(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr, int index){
        if(index==arr.length){
            return;
        }
        else{
            int last=arr.length-index-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
        selectionsort(arr,index+1);
    }

    static void swap(int[] arr,int first, int second) {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int[] arr,int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) { //<=last since max element may be at 'last' index
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


    static void selectionmethod2(int[] arr, int row,int col, int max){

        if(row==0){
            return;
        }
        if(col<row){
            if(arr[max]<arr[col]){   //considering max element equal to the first element
                selectionmethod2(arr,row,col+1,col);
            }
            else{
                selectionmethod2(arr,row,col+1,max);
            }
        }
        //after complete traversal of the row-we have the max element
        else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            /* if row=4, last element will be at index 3,
            if row=3, that is last element is already sorted so number of cols in this row will be 3
            and last element will be at index 2*/
            arr[row-1]=temp;
            selectionmethod2(arr,row-1,0,0);
        }
    }

}
