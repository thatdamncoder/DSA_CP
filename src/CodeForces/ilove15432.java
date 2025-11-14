package CodeForces;

import java.util.Scanner;

public class ilove15432 {
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
            for(int i=0,j=0; i<n/2 && j<m/2;i++,j++){
                StringBuilder sb=new StringBuilder();
                for(int k=j;k<=m-j-1;k++){
                    sb.append(arr[i][k]);
                }
                for(int k=i+1;k<=n-i-1;k++){
                    sb.append(arr[k][m-j-1]);
                }
                for(int k=m-j-2;k>=j;k--){
                    sb.append(arr[n-i-1][k]);
                }
                for(int k=n-i-2;k>i;k--){
                    sb.append(arr[k][j]);
                }
                sb.append(sb.substring(0,3));
                count+=solve(sb.toString());
            }
            System.out.println(count);
        }
    }
    public static int solve(String s){
        int count=0;
        for(int i=0;i+4<=s.length();i++){
            if(s.substring(i,i+4).equals("1543")) count++;
        }
        return count;
    }
}
