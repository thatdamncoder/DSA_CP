package CodeForces;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int[] arr=new int[n];
            int count=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]>h) count++;
            }
            System.out.println(2*(count) + (n-count));
        }
    }
}
