package CodeForces;

import java.util.Scanner;

public class BinaryPath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            char[][] arr=new char[2][n];
            arr[0]=sc.next().toCharArray();
            arr[1]=sc.next().toCharArray();
            ans="";
            int count=rec(0,0,"",arr);
            System.out.println(ans);
            System.out.println(count+1);
        }
    }
    static String ans;
    public static int rec(int i,int j,String s,char[][] arr){
        if(i==1 && j==arr[0].length-1){
            if(ans.isEmpty() || (s+arr[i][j]).compareTo(ans)<=0){
                if((s+arr[i][j]).compareTo(ans)==0) return 1;
                ans=s+arr[i][j];
            }
            return 0;
        }
        int right=0;
        int down=0;
        if(j+1<arr[0].length){
            right=rec(i,j+1,s+arr[i][j],arr);
        }
        if(i+1<2){
            down=rec(i+1,j,s+arr[i][j],arr);
        }
        return right+down;
    }
}
