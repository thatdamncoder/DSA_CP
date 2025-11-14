package CodeForces;

import java.util.*;

public class Squares {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            Map<Integer, List<Integer>> map=new HashMap<>();
            int ans=0;
            for (int i = 0; i < 4; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(!map.containsKey(b)){
                    map.put(b,new ArrayList<>());
                }
                map.get(b).add(a);
            }
            for(List<Integer> i:map.values()){
                ans=Math.abs(i.get(0)-i.get(1));
                break;
            }
            System.out.println(ans*ans);
        }
    }
}
