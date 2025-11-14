package CodeForces;

import java.util.Scanner;

public class ArrowPath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            char[][] arr=new char[2][n];
            arr[0]=sc.next().toCharArray();
            arr[1]=sc.next().toCharArray();
            Integer[][][] t=new Integer[2][n+1][2];
            boolean ans=rec(0,0,0,n,arr,t);
            System.out.println(ans?"YES":"NO");
        }
    }
    public static boolean rec(int i,int j,int taken,int n,char[][] arr,Integer[][][] t){
        if(i==1 && j==n-1) return true;
        if(i<0 || j<0 || i>=2 || j>=n) return false;
        if(t[i][j][taken]!=null) return t[i][j][taken] == 1;
        boolean down=false;
        boolean right=false;
        boolean left=false;
        if((i==0 && j==0) || taken==0) {
            down = rec(i + 1, j, 1, n, arr,t);
            right = rec(i, j + 1, 1, n, arr,t);
//            if(j-1>=0) left=rec(i,j-1,1,n,arr);
        }
        if(taken==1){
           if(arr[i][j]=='>') right=right||rec(i,j+1,0,n,arr,t);
//           else left=rec(i,j-1,0,n,arr);
//            else return false;
        }
        t[i][j][taken]=(down||right)?1:0;
        return down||right;
    }
}
