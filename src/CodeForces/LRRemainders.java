package CodeForces;

import java.util.Scanner;

public class LRRemainders {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int[] arr=new int[n];
            long prod=1;
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                prod*=arr[i];
            }
            String s=sc.next();
            int i=0;
            int j=n-1;
            for (int k = 0; k < n; k++) {
                System.out.print(prod%m + " ");
                if(s.charAt(k)=='L'){
                    prod/=arr[i++];
                }else{
                    prod/=arr[j--];
                }
            }
            System.out.println();
        }
    }
}
