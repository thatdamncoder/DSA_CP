package CodeForces;

import java.util.*;

public class SetOfStrangers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]= sc.nextInt();
                }
            }
            Set<Integer> two=new HashSet<>();
            Set<Integer> total=new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    total.add(arr[i][j]);
                    if((i+1<n && arr[i][j]==arr[i+1][j]) ||
                       (j+1<m && arr[i][j]==arr[i][j+1]) ) two.add(arr[i][j]);
                }
            }
//            System.out.println(two);
//            System.out.println(one);
            int totaltwo=two.size();
            int tot=total.size();
            if(totaltwo==0) System.out.println(tot-1);
            else System.out.println((totaltwo-1)*2 + tot-totaltwo);
        }
    }
}
