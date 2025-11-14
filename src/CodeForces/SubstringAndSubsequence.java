package CodeForces;

import java.util.Scanner;

public class SubstringAndSubsequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            String t=sc.next();
            int ans=lcs(s,t);
            ans=s.length()+t.length()-ans;
            System.out.println(ans);
        }
    }
    public static int lcs(String s,String u){
        int n=s.length();
        int m=u.length();
        int[][] t=new int[n+1][m+1];
        for (int i = 1; i <=n ; i++){
            for (int j = 1; j <=m ; j++) {
                if(s.charAt(i-1)==u.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }
}
