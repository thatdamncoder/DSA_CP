package RandomTry;


import java.util.Arrays;

public class magicMatrix {
    public static void main(String[] args) {
        int n=3;
        int[][] arr=new int[n][n];
        for (int[] a:arr) {
            Arrays.fill(a,0);
        }

        magic2(3,arr,1,n/2,n-1);

        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
    }
    static void magic(int n,int[][] arr,int item,int row,int col){
        if(item>n*n){
            return;
        }
        if(arr[row][col]!=0){
            row+=1;
            col=col-2;
            return;
        }
        if(row==-1 && col==n){
            row=0;
            col=n-2;
            return;
        }
        if(row==-1){
            row=n-1;
            return;
        }
        if(col==n){
            col=col%n;
            return;
        }
        arr[row][col]=item;
        magic(n,arr,item+1,row-1,col+1);
    }
    static void magic2(int n, int[][] arr, int item, int row, int col) {
        if (item > n * n) {
            return;
        }
        if (arr[row][col] != 0) {
            row = (row + 1) % n;
            col = (col - 2 + n) % n;
        } else {
            arr[row][col] = item;
            magic2(n, arr, item + 1, (row - 1 + n) % n, (col + 1) % n);
        }
    }
}

