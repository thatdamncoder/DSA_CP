package CodeForces;

import java.util.*;

public class Startup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            Map<Integer,Long> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                map.put(a,map.getOrDefault(a,0L)+b);
            }
            List<Long> list=new ArrayList<>();
            list.addAll(map.values());
            Collections.sort(list);
            long ans=0;
            for(int i=list.size()-1;i>=0 && k>0;i--){
                ans+=list.get(i);
                k--;
            }
            System.out.println(ans);
        }
    }
}
