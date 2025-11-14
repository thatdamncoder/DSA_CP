package CSES;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
//        while(num--!=0){
//            int n=sc.nextInt();
//            int[] arr=new int[n];
//            long mid=0;
//            for (int i = 0; i < n; i++) {
//                arr[i]=sc.nextInt();
//                mid+=arr[i];
//            }
//            mid/=n;
//            long ans=0;
//            for (int i = 0; i < n; i++) {
//                ans+=Math.abs(mid-arr[i]);
//            }
//            System.out.println(ans);
//        }
        String s="";
        for (int i = 0; i <= 100; i++) {
            s+=i;
        }
        System.out.println(s);
        System.out.println(s.charAt(113));
    }
}
