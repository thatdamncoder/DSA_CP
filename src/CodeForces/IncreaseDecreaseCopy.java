package CodeForces;

import java.util.Scanner;

public class IncreaseDecreaseCopy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long[] b=new long[n+1];
            for (int i = 0; i < n+1; i++) {
                b[i]= sc.nextLong();
            }
            long last=b[n];
            long min=Integer.MAX_VALUE;
            boolean f=false;
            long ans=0;
            for (int i = 0; i < n; i++) {
                long as=Math.abs(last-a[i]);
                long bs=Math.abs(last-b[i]);
//                System.out.println(as + " " + bs);
                ans+=Math.abs(a[i]-b[i]);
                if(!f && a[i]>=b[i] && b[i]<=last && last<=a[i]){
                    f=true;
//                    break;
                }
                else if(!f && a[i]<=b[i] && b[i]>=last && last>=a[i]){
                    f=true;
//                    break;
                }
//                System.out.println(ans);
                min=Math.min(min,Math.min(as,bs));
            }
            if(f) System.out.println(ans+1);
            else System.out.println(ans+min+1);
        }
    }
}
