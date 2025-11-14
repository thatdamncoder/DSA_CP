package CodeForces;

import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int max=0;
            int count=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]!=0){
                    max=Math.max(max,count);
                    count=0;
                }else{
                    count++;
                }
            }
            max=Math.max(max,count);
            System.out.println(max);
        }
    }
}
