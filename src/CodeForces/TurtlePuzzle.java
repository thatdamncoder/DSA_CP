package CodeForces;

import java.util.Scanner;

public class TurtlePuzzle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            long sum=0L;
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                sum+=Math.abs(arr[i]);
            }
            System.out.println(sum);
        }
    }
}
