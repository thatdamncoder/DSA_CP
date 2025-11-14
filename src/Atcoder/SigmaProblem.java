package Atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SigmaProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            int mod=100000000;
            long ans=0;
            for (int i = 0; i < n; i++) {
                long a=arr[i]%mod;
                ans+=(a)*((n-i-1)%mod);
            }
            long f=ans;
            System.out.println(f);
        }
    }
}
