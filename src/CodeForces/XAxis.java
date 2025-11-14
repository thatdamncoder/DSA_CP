package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class XAxis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=3;
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]-arr[0]+arr[2]-arr[1]);
        }
    }
}
