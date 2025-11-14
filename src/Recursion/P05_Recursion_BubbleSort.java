package Recursion;

//bubble sort using recursion same as pattern triangle - P04_Recursion_Patterns/pattern1method2

public class P05_Recursion_BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,-2,5,0};
//        bubblesort(arr, arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
//
    }

    static void bubblesort(int[] arr,int iteration,int index){
        //starting iteration from arrlength-1 and going till 0 , starting index from 0 till arrlength-1
        if(iteration==0){
            return;
        }
        if(index<iteration){
            if(arr[index]>arr[index+1]){
                int temp;
                temp=arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
            bubblesort(arr,iteration,index+1);
        }
        else{
            bubblesort(arr,iteration-1,0);
        }
    }
}
