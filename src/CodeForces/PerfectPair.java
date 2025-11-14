package CodeForces;

import java.util.*;

public class PerfectPair {
    static Map<Long,Integer> map = new HashMap<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count=0;
            Map<Long,Integer> f=new HashMap<>();
            for (int i = 0; i < n; i++) {
                long fac=primefactors(arr[i]);
                if(f.containsKey(fac)){
                    count+=f.get(fac);
                }
                f.put(fac,f.getOrDefault(fac,0)+1);
            }
            System.out.println(count);
        }

    }
    public static long primefactors(int n){
        long ans=0;
        while(n%2==0){
            if (!map.containsKey(2L)) map.put(2L,map.size());
            ans|=(1L <<map.get(2L));

            n/=2;
        }
        for (int i = 3; i*i <= n; i+=2) {
            while(n%i==0){
                if (!map.containsKey((long)i)){
                    map.put((long) i,map.size());

                }
                ans|=(1L <<map.get((long)i));
                n/=i;
            }
        }
        if(n>2) {
            if (!map.containsKey((long)n)){
                map.put((long )n,map.size());

            }
            ans|=(1L <<map.get((long)n));
        }
        return ans;
    }
}
