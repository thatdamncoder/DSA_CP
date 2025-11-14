package RandomTry;

import java.util.Arrays;
import java.util.Stack;

public class sortarrayrecursion {
    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
        System.out.println(Arrays.toString(arr));
        sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int index){
        if(index==0){
            return;
        }
        int t=arr[arr.length-1];
        sort(arr,index-1);
        insertBottom(arr,t,index);

    }
    static void insertBottom(int[] arr,int item,int index){
        if(index==0){
            return;
        }
        if(arr.length==0 || arr[index-1]<item){
            int temp=arr[index];
            arr[index-1]=item;
            arr[index]=temp;
            return;
        }
        int t=arr[arr.length-1];
        insertBottom(arr,item,index-1);
        arr[index]=t;
    }

}
