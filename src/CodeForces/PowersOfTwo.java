package CodeForces;

import java.util.*;

public class PowersOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            Queue<Integer> queue=new LinkedList<>();
            for (int i = 0; i < 32; i++) {
                if(((n>>i)&1)==1){
                    map.put((1<<i),map.getOrDefault((1<<i),0)+1);
                    if(i!=0) queue.offer((1<<i));
                }
            }
            if(map.size()>k || n<k){
                System.out.println("NO");
                continue;
            }
            int count=map.size();
            while(count<k && !queue.isEmpty()){
                int popped=queue.poll();
                map.put(popped,map.getOrDefault(popped,0)-1);
                map.put(popped/2,map.getOrDefault(popped/2,0)+2);
                if(popped/2>1){
                    queue.offer(popped/2);
                    queue.offer(popped/2);
                }
                count++;
            }
            System.out.println("YES");
            for(int i:map.keySet()){
                for (int j = 0; j < map.get(i); j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
