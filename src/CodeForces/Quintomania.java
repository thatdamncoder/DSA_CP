package CodeForces;

import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean ok=true;
            for (int i = 0; i+1<n ; i++) {
                int f=Math.abs(arr[i]-arr[i+1]);
                if(f!=5 && f!=7){
                    ok=false;
                    break;
                }
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
