package CodeForces;

import java.util.Scanner;

public class checkrough {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
//            System.out.print(arr[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(arr[i]%arr[i-1] + " ");
            }
            System.out.println();

        }
    }
}
