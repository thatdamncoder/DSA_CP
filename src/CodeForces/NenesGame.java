package CodeForces;

import java.util.Scanner;

public class NenesGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int que=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int[] q=new int[que];
            for (int i = 0; i < que; i++) {
                q[i]= sc.nextInt();
            }
            for(int i=0;i<que;i++){
                int init=q[i];
                if(init<arr[0]) System.out.print(init + " ");
                else System.out.print(arr[0]-1 + " ");
            }
            System.out.println();
        }
    }
}
