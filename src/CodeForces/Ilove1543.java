package CodeForces;

import java.util.Scanner;

public class Ilove1543 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            char[][] arr=new char[n][m];
            for (int i = 0; i < n; i++) {
                String s=sc.next();
                arr[i]=s.toCharArray();
            }
            int count=0;
            String s="1543";
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]=='1'){
                        count+=dfs(i+1,j,1,s,1,arr);
                        count+=dfs(i-1,j,1,s,0,arr);
                        count+=dfs(i,j-1,1,s,2,arr);
                        count+=dfs(i,j+1,1,s,3,arr);
                    }
                }
            }
            System.out.println(count);
        }
    }
    //up down left right
    //0 1 2 3
    public static int dfs(int i,int j,int k,String s,int dir,char[][] arr){
        if(i>=arr.length || j>=arr[0].length || i<0 || j<0) return 0;
        if(arr[i][j]!=s.charAt(k)) return 0;
        if(k==3) return 1;
        int ans=0;
        if(dir==0){
            ans=dfs(i-1,j,k+1,s,0,arr);
            ans+=dfs(i,j+1,k+1,s,3,arr);
        }
        else if(dir==1){
            ans=dfs(i+1,j,k+1,s,1,arr);
            ans+=dfs(i,j-1,k+1,s,2,arr);
        }
        else if(dir==2){
            ans=dfs(i,j-1,k+1,s,2,arr);
            ans+=dfs(i-1,j,k+1,s,0,arr);
        }
        else{
            ans+=dfs(i,j+1,k+1,s,3,arr);
            ans+=dfs(i+1,j,k+1,s,1,arr);
        }
        return ans;
    }
}
