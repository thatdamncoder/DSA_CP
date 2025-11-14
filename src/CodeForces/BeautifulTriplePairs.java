package CodeForces;

import java.util.Scanner;

public class BeautifulTriplePairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i +2< n; i++) {
                int a=arr[i];
                int b=arr[i+1];
                int c=arr[i+2];

            }
        }
    }
}
