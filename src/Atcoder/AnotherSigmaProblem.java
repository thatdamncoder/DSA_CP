package Atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnotherSigmaProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextLong();
            }
            long ans=0;
            long mod=998244353;
            Map<Long,Long> map=new HashMap<>();
            long[] powerOfTen = new long[19];
            powerOfTen[0] = 1;
            for (int i = 1; i < 19; i++) {
                powerOfTen[i] = powerOfTen[i - 1] * 10 % mod;
            }
            for (int i = n-1; i >=0 ; i--) {
                for(long key:map.keySet()){
                    ans=(ans%mod+(((arr[i]%mod)*(map.get(key)%mod)*(powerOfTen[(int)key]))%mod))%mod;
                }
                String s=""+arr[i];
                map.put((long)s.length(),map.getOrDefault((long)s.length(),0L)+1);
                ans=(ans%mod + ((arr[i]%mod*(i%mod))%mod))%mod;
            }
            System.out.println(ans);
        }
    }
}
