package Sorting;

import java.util.Arrays;

/*
bubblesort- start from first element
            swap two element if not in order just change sign for asc or desc

            time= O(N2)
            for small arrays-okayish
            for larger- BAD (please dont)
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr={2,4,2,5,1,5,1,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        bubblesort1(arr);
        System.out.println(Arrays.toString(arr));
//        int[] a={2,5,6,1,3,4};
//        int[] arr={1,5,3,6,2,4};
//        bubblesort1(arr);
    }
    public static void bubblesort1(int[] arr) {
        int n=arr.length;
        for (int i = 0; i<n-1; i++) {
            boolean ok=true;
            for (int j = 0; j+1<n-i; j++) {
                if(arr[j]>arr[j+1]){
                    ok=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(ok) break;
        }
    }
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void b2(int[] arr,int[] a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    int tempa=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tempa;

                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
