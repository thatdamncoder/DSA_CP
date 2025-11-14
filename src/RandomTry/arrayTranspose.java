package RandomTry;

import java.util.Arrays;

public class arrayTranspose {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("\n");
        transposecol(arr);
        rotateRows(arr);
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }

    }
    static void transposecol(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void rotateRows(int[][] arr) {
        for (int j = 0; j < arr[0].length / 2; j++) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }
}
