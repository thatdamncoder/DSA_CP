package RandomTry;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0) System.out.println("size of array should be greater than 0 --- try again");
        else {
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            selectionsort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void bubble(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for(int j=0;j+1<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void insertionsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            for(;j>=0 && arr[j]>curr;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=curr;
        }
    }
    public static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }
}
