package Recursion;

import java.util.Arrays;

//BACKTRACKING- make a change -> revert the change when the work is done
public class P15_Recursion_BackTracking {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] ans=new int[maze.length][maze[0].length];
//        mazealldirectionscorrect("",maze,0,0);
        mazepathmatrix("",maze,0,0,1,ans);

    }
    static void mazealldirectionscorrect(String p,boolean[][] maze,int x, int y){
        //starting from 0,0
        if(x == maze.length-1 && y == maze[0].length-1) {

            System.out.println(p);

            return;
        }
        if(!maze[x][y]) {
            return;
        }

        //for this block, specific recursion call
        //make a change
        maze[x][y]=false;
        if(x>0){
            //maze[x-1][y]=false;
            mazealldirectionscorrect(p+"U",maze,x-1,y);

        }
        if(y>0){
            //maze[x][y-1]=false;
            mazealldirectionscorrect(p+"L",maze,x,y-1);
            //maze[x][y-1]=true;
        }
        if(x<maze.length-1){
            //maze[x+1][y]=false;
            mazealldirectionscorrect(p+"D",maze,x+1,y);
            //maze[x+1][y]=false;
        }
        if(y<maze[0].length-1){
            //maze[x][y+1]=false;
            mazealldirectionscorrect(p+"R",maze,x,y+1);

        }

        //after one whole recursion call (here,that is one 'p')
        //check if answer is required answer and remove that change for the next recursion call
        //reverting the changes while returning
        maze[x][y]=true;

    }

    static void mazepathmatrix(String p,boolean[][] maze,int x, int y,int count,int[][] ans){

        //ans[x][y]==0 means not visited

        if(x == maze.length-1 && y == maze[0].length-1) {
            ans[x][y]=count;

            System.out.println(p);
            printmatrix(ans);
            System.out.println();
            return;
        }
        if(!maze[x][y]) {
            return;
        }
        maze[x][y]=false;
        ans[x][y]=count;

        if(x>0){
            mazepathmatrix(p+"U",maze,x-1,y,count+1,ans);
        }
        if(y>0){
            mazepathmatrix(p+"L",maze,x,y-1,count+1,ans);
        }
        if(x<maze.length-1){
            mazepathmatrix(p+"D",maze,x+1,y,count+1,ans);
        }
        if(y<maze[0].length-1){
            mazepathmatrix(p+"R",maze,x,y+1,count+1,ans);
        }
        maze[x][y]=true;
        ans[x][y]=0;

    }
    static void printmatrix(int[][] matrix){
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
