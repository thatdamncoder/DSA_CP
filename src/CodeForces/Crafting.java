package CodeForces;

import java.util.Scanner;

public class Crafting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for (int i = 0; i < n; i++) a[i]= sc.nextInt();
            for (int i = 0; i < n; i++) b[i]= sc.nextInt();
            int min=Integer.MAX_VALUE;
            int count=0;
            boolean ok=true;
            int incr=0;
            for (int i = 0; i < n; i++) {
                if(a[i]-b[i]<0){
                    incr=a[i]-b[i];
                    if(++count>1){
                        ok=false;
                        break;
                    }
                }
                else min=Math.min(min,a[i]-b[i]);
            }
            if(!ok || -1*incr>min) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
