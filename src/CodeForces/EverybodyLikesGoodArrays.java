package CodeForces;

import java.util.Scanner;

public class EverybodyLikesGoodArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int prev=arr[0];
            int count=0;
            for (int i = 1; i < n; i++) {
                if((prev%2==0 && arr[i]%2==0) || (prev%2!=0 && arr[i]%2!=0)){
                    prev=prev*arr[i];
                    count++;
                }
                else prev=arr[i];
            }
            System.out.println(count);
        }
    }

}
