package RandomTry;

import java.util.Arrays;

public class arrayTransposeInplace {

    //only if the matrix was a square matrix
    public static void main(String[] args) {
        int[][] arr= { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        for(int[] array:arr){
            System.out.println(Arrays.toString(array));
        }
        inplacetranspose(arr);
        for(int[] array:arr){
            System.out.println(Arrays.toString(array));
        }
    }
    static void inplacetranspose(int[][] arr){
        int i=0;
        int j=i+1;
        while(i<arr.length && j<arr[i].length){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            j++;
            if(j==arr[i].length){
                i++;
                j=i+1;
            }
        }
    }
}
