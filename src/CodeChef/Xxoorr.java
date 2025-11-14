package CodeChef;

import java.util.Scanner;

public class Xxoorr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int[] count=new int[32];
            for (int i = 0; i < 32; i++) {
                for (int j = 0; j < n; j++) {
                    count[i] += ((arr[j] >> i) & 1);
                }
            }
            long ans=0;
            for (int i = 0; i < 32; i++) {
                ans+=(long)(Math.ceil(count[i]*1.0/k));
            }
            System.out.println(ans);
        }
    }
}
