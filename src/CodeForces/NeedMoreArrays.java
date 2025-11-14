package CodeForces;

import java.util.Scanner;

public class NeedMoreArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int count=1;
            int ele=arr[0];
            for (int i = 1; i < n; i++) {
                if(ele+1<arr[i]){
                    count++;
                    ele=arr[i];
                }
            }
            System.out.println(count);
        }
    }
}
