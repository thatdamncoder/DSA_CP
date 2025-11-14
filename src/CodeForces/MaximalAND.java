package CodeForces;

import java.util.*;

public class MaximalAND {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int[] count=new int[31];
            for (int i = 0; i < 31; i++) {
                for (int j = 0; j < n; j++) {
                    count[i]+=((arr[j]>>i)&1)^1;
                }
            }
            int ans=0;
//            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 30; i>=0; i--) {
                if (count[i] == 0) {
                    ans += 1<<i;
                }
                else{
                    if (k>0 && k>=count[i]) {
                        if(ans+Math.pow(2,i)<=Integer.MAX_VALUE){
                            ans+=1<<i;
                            k-=count[i];
                        }
                    }
                }
            }
//                else{
//                    map.put(count[i],Math.max(map.getOrDefault(count[i],0),i));
//                }
//            }
//            int[][] pair=new int[map.size()][2];
//            int index=0;
//            for (int i:map.keySet()) {
//                pair[index][0]=i;
//                pair[index++][1]=map.get(i);
//            }
//            Arrays.sort(count, (a,b)->(b[1]-a[1]));
//            for (int[] a:count) {
//                if (k>0 && k>=a[0]) {
//                    if(ans+Math.pow(2,a[1])<=Integer.MAX_VALUE){
//                        ans+=(long)Math.pow(2,a[1]);
//                        k-=a[0];
//                    }
//                }
//            }
            System.out.println(ans);
        }
    }
}
