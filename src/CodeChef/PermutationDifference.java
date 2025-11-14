package CodeChef;

import java.util.Scanner;

public class PermutationDifference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int count=0;
            for (int i = 0; i+1 < n; i++) {
                if(arr[i]==i+1){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    count++;
                }
            }
            System.out.println(count+(arr[n-1]==n?1:0));
        }
    }
}
