package CodeForces;

import java.util.*;

public class ProgressiveSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
//            List<Integer> list=new ArrayList<>();
            Map<Integer,Integer> map=new HashMap<>();
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < n*n; i++) {
                int a=sc.nextInt();
                min=Math.min(min,a);
                map.put(a,map.getOrDefault(a,0)+1);
            }
            boolean ok=true;
            int start=min;
            for (int i = 0; i < n && ok; i++) {
                if(!map.containsKey(start) || map.get(start)==0) ok=false;
                else map.put(start,map.get(start)-1);
                int tempstart=start;
                for (int j = 1; j< n && ok; j++) {
                    tempstart+=d;
                    if(!map.containsKey(tempstart) || map.get(tempstart)==0) ok=false;
                    else map.put(tempstart,map.get(tempstart)-1);
                }
                start+=c;
            }
            System.out.println(ok?"YES":"NO");
        }

    }
}
