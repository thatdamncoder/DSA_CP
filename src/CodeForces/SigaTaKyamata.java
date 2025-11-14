package CodeForces;

import java.util.Scanner;

public class SigaTaKyamata {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            String s=sc.next();
            boolean ok=true;
            int l=0;
            int r=0;
            int zero=0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='1' && (arr[i]==1 || arr[i]==n)){
                    ok=false;
                }
                if(s.charAt(i)=='1' && (i==0 || i==n-1 )) ok=false;
//                if(arr[i]==1) l=i;
//                if(arr[i]==n) r=i;
                if(s.charAt(i)=='0') zero++;
            }
            if(zero==n) System.out.println(0);
            else if(!ok) System.out.println(-1);
            else{
                System.out.println(1);
                System.out.println(1 +  " " + n);
            }
        }
    }
}
