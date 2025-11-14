package CodeForces;

import java.util.Scanner;

public class ChayaCalender {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int year=arr[0];
            for (int i = 1; i < n; i++) {
                if(arr[i]<=year){
                    year=year+(arr[i]-(year%arr[i]));
                }
                else year=arr[i];
            }
            System.out.println(year);
        }
    }
}
