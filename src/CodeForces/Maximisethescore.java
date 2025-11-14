package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Maximisethescore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int sum=0;
            for (int i = 2*n-2; i >=0 ; i-=2) {
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
