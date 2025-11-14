package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class P14_Recursion_Maze {
    public static void main(String[] args) {
//        System.out.println(countMaze(3,3));
//        System.out.println(maze(3,3,""));
//        maze("",3,3);
//        System.out.println(mazelist("",3,3));
//        mazewithobstacles("",0,0);
//        boolean[][] obstacle={
//                {true,true,true},
//                {true,false,true},
//                {true,true,true},
//                {true,false,true}
//        };
//        mazewithobstaclesmatrix("",obstacle,0,0);
//        mazeallDirections("",0,0);
//        boolean[][] maze = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}
//        };
//        mazealldirectionscorrect("",maze,maze,0,0);
        int[][] arrLC = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        for (int[] a : arrLC) {
            System.out.println(Arrays.toString(a));
        }
//        LCsetMatrixZero(arrLC, 0, 0, 2, 2, maze);
//        matrixZero(arrLC,0,0);
         matrixZeroNorecursion(arrLC);
        for (int[] a : arrLC) {
            System.out.println(Arrays.toString(a));
        }

    }

    static int countMaze(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        int count = 0;
        count = count + countMaze(x - 1, y);
        count = count + countMaze(x, y - 1);
        return count;
    }

    static void maze(String p, int x, int y) {
        if (x == 1 && y == 1) {
            System.out.println(p);
            return;
        }

        //Method 1
//        if(x==1){
//            maze(p+"R",x,y-1);
//            return;
//        }
//        if(y==1){
//            maze(p+"D",x-1,y);
//            return;
//        }
//        maze(p+"D",x-1,y);
//        maze(p+"R",x,y-1);

        //Method 2
        if (x > 1) {
            maze(p + "D", x - 1, y);
        }
        if (y > 1) {
            maze(p + "R", x, y - 1);
        }
    }

    static ArrayList<String> mazelist(String p, int x, int y) {
        ArrayList<String> list = new ArrayList<>();
        if (x == 1 && y == 1) {
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (x > 1) {
            ans.addAll(mazelist(p + "D", x - 1, y));
        }
        if (y > 1) {
            ans.addAll(mazelist(p + "R", x, y - 1));
        }
        if (x > 1 && y > 1) {
            ans.addAll(mazelist(p + "G", x - 1, y - 1));     //Diagonal right
        }
        return ans;
    }

    static void mazewithobstaclesmatrix(String p, boolean[][] maze, int x, int y) {
        //starting from 0,0
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[x][y]) {
            return;
        }
        if (x < maze.length - 1) {
            mazewithobstaclesmatrix(p + "D", maze, x + 1, y);
        }
        if (y < maze[0].length - 1) {
            mazewithobstaclesmatrix(p + "R", maze, x, y + 1);
        }
    }

    static void mazewithobstacles(String p, int x, int y) {
        //starting from 0,0
        //obstacle at 1,1
        if (x == 2 && y == 2) {
            System.out.println(p);
            return;
        }
        if (x == 1 && y == 1) {
            return;
        }
        if (x < 2) {
            mazewithobstacles(p + "D", x + 1, y);
        }
        if (y < 2) {
            mazewithobstacles(p + "R", x, y + 1);
        }
    }

    //will result in stack overflow
    static void mazeallDirections(String p, int x, int y) {
        //starting from 0,0
        if (x == 2 && y == 2) {
            System.out.println(p);
            return;
        }
        if (x > 0) {
            mazeallDirections(p + "U", x - 1, y);
        }
        if (y > 0) {
            mazeallDirections(p + "L", x, y - 1);
        }
        if (x < 2) {
            mazeallDirections(p + "D", x + 1, y);
        }
        if (y < 2) {
            mazeallDirections(p + "R", x, y + 1);
        }
    }

    static void mazealldirectionscorrect(String p, boolean[][] maze, boolean[][] savemaze, int x, int y) {
        //starting from 0,0
        if (x == maze.length - 1 && y == maze[0].length - 1) {

            System.out.println(p);

            return;
        }
        if (!maze[x][y]) {
            return;
        }

        //for this block, specific recursion call
        //make a change
        maze[x][y] = false;
        if (x > 0) {
            //maze[x-1][y]=false;
            mazealldirectionscorrect(p + "U", maze, savemaze, x - 1, y);

        }
        if (y > 0) {
            //maze[x][y-1]=false;
            mazealldirectionscorrect(p + "L", maze, savemaze, x, y - 1);
            //maze[x][y-1]=true;
        }
        if (x < maze.length - 1) {
            //maze[x+1][y]=false;
            mazealldirectionscorrect(p + "D", maze, savemaze, x + 1, y);
            //maze[x+1][y]=false;
        }
        if (y < maze[0].length - 1) {
            //maze[x][y+1]=false;
            mazealldirectionscorrect(p + "R", maze, savemaze, x, y + 1);

        }

        //after one whole recursion call (here,that is one 'p')
        //check if answer is required answer and remove that change for the next recursion call
        //reverting the changes while returning
        maze[x][y] = true;

    }

    static void LCsetMatrixZero(int[][] arr, int r, int c, boolean[][] flag) {
        if (arr[r][c] == 0) {
            flag[r][c]=false;
            for (int i = 0, j = 0; i <= 2 && j <= 2; i++, j++) {

                if(flag[r][j]){
                    flag[r][c]=false;
                }
                else{
                    return;
                }
                arr[r][j] = 0;
                arr[i][c] = 0;
                if(flag[i][c]){
                    flag[i][c]=false;
                }
                else{
                    return;
                }

            }
            return;

        }

//        if(c>0){
//            LCsetMatrixZero(arr,r,c-1);
//        }
        if(!flag[r][c]){
        return;}

//        flag[r][c]=false;
        if (r < 2) {
            LCsetMatrixZero(arr, r + 1, c,flag);
//            if(arr[r][c]==0){
//                return;
//            }
        }
        if (c < 2) {
            LCsetMatrixZero(arr, r, c + 1,flag);
        }
//        if(r>0){
//            LCsetMatrixZero(arr,r-1,c);
//        }
//        flag[r][c]=true;

    }

    static void matrixZero(int[][] arr, int r, int c) {
        boolean runforloop=false;
        if (arr[r][c] == 0) {
            runforloop=true;
            arr[0][c]=-1;
            arr[r][0]=-1;
            return;
        }
        if (r < 2) {
            matrixZero(arr, r + 1, c);

        }
        if (c < 2) {
            matrixZero(arr, r, c + 1);
        }

        if(!runforloop){
            return;
        }
        for(int i: arr[0]){
            if(i==-1){
                Arrays.fill(arr[0],0);
                break;
            }
        }
        boolean foundzeroincol=false;
        for(int i=0;i<2;i++){
            if(arr[i][0]==-1){
                foundzeroincol=true;
                break;
            }
        }
        if(foundzeroincol) {
            for (int j = 0; j < 2; j++) {
                arr[j][0]=0;
            }
        }
    }
    static void matrixZeroNorecursion(int[][] arr) {

        boolean firstCol=false,firstRow=false;


        //Step 1 : check for zeros and mark in the first row/col
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){

                if(arr[i][j]==0){

                    if (j==0) firstCol=true;
                    if (i==0) firstRow=true;

                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        //Step 2 : make rows and cols zeros if they have a zero, except first row/col
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }



        //Step 3 : making the firstrow and firstcol zero if required

        //atleast one element is zero in the first row :- therefore making all zero
        if(firstRow){
            Arrays.fill(arr[0], 0);

        }

        //atleast one element is zero in the first col :- therefore making all zero
        if(firstCol){
            for(int i=0;i<arr.length;i++){
                arr[i][0]=0;
            }
        }
    }

}
