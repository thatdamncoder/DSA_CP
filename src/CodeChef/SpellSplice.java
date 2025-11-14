package CodeChef;

import java.util.Scanner;

public class SpellSplice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[][] arr=new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            long ans=0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    long calc=((long) arr[i][0] *arr[j][1]) + ((long) arr[i][1] *arr[j][0]);
                    ans=Math.max(ans,calc);
                }
            }
            System.out.println(ans);
        }
    }
}
