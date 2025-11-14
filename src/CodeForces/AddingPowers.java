package CodeForces;

import java.util.Scanner;

public class AddingPowers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean ok=true;
            for (int i = 0; i < n && ok; i++) {
                if(arr[i]!=0){
                    long power=(long)Math.pow(k,i+1);
                    System.out.println(power + " " + arr[i]);
                    if(arr[i]%power!=0) ok=false;
                }
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
