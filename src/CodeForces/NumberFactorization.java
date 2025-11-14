package CodeForces;

import java.util.*;

public class NumberFactorization {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long n=sc.nextInt();
            Map<Long,Long> map=new HashMap<>();
            while(n%2==0){
                map.put((long)2,map.getOrDefault((long)2,0L)+1);
                n/=2;
            }
            for (int i = 3; (long) i *i <= n; i+=2) {
                while(n%i==0){
                    map.put((long)i,map.getOrDefault((long)i,0L)+1);
                    n/=i;
                }
            }
            if(n>2) {
                map.put((long)n,map.getOrDefault((long)n,0L)+1);
            }
//            System.out.println(map);
            int m=map.size();
            long[][] arr=new long[m][2];
            int index=0;
            long multi=1;
            for(long key:map.keySet()){
                multi*=key;
                arr[index][0]=key;
                arr[index++][1]=map.get(key);
            }
////            Arrays.sort(arr,(a, b)->(b[1]-a[1]));
            Arrays.sort(arr, Comparator.comparingLong(a -> a[1]));
//            for(long[] a:arr) System.out.println(Arrays.toString(a));
            long deduct=0;
            long ans=0;
            for(int i=0;i<m;i++){
                if(i==m-1){
                    ans+=(arr[i][1]-deduct)*(multi);
                }
                else{
                    long r=arr[i][1]-deduct;
                    deduct+=r;
                    while(r-->0) {
                        ans += multi;
                    }
//                    System.out.println(multi + " " + ans);
                    multi/=arr[i][0];
                }

            }
            System.out.println(ans);
        }
    }
}
