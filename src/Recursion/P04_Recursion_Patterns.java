package Recursion;

public class P04_Recursion_Patterns {
    public static void main(String[] args) {
        pattern1method2(4,0);
        pattern1method1(4,1,4);
    }
    static void pattern1method1(int n, int rows,int cols) {
        //starting rows from 1 to 4, and cols from 4 to 1

        //pattern completed
        if (rows == n+1) {
            return;
        }
        //row change
        if (cols < 1) {
            System.out.println();
            rows=rows+1;
            pattern1method1(n, rows , n-rows+1);
        }
        if (cols >= 1) {
            System.out.print("* ");
            pattern1method1(n, rows, cols - 1);
        }
    }

    static void pattern1method2(int row,int col){
        //starting row from n and going till 1 , starting col from 0 till n-1
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            pattern1method2(row,col+1);
        }
        else{
            System.out.println();
            pattern1method2(row-1,0);
        }
    }
    static void pattern2(int row,int col){
        //starting row from n and going till 1 , starting col from 0 till n-1
        if(row==0){
            return;
        }
        if(col<row){
            pattern2(row,col+1);
            System.out.print("* ");    //prints when the stack is getting emptied
        }
        else{
            pattern2(row-1,0);
            System.out.println();
        }
    }

}
