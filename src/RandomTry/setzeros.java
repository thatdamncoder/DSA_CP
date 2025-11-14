package RandomTry;

import java.util.Arrays;

public class setzeros {
    public static void main(String[] args) {
//        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//        for (int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
//        for (int i = 0, j = 0; i <= 2 && j <= 2; i++, j++) {
//            arr[1][j] = 0;
//            arr[i][1] = 0;
//        }
//        for (int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
        System.out.println(checkoperator('/'));
    }
        static int checkoperator(char ch){
            if(ch=='+' || ch=='-'){
                return 0;
            }
            if(ch=='*' || ch=='/' || ch=='%'){
                return 1;
            }
            return -1;
        }

}
