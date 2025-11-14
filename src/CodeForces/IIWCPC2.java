package CodeForces;

import java.util.*;

public class IIWCPC2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int v=sc.nextInt();
            int b=sc.nextInt();
            Map<Integer, List<Integer>> map=new HashMap<>();
            for (int i = 1; i <= v; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int i = 0; i < b; i++) {
                int b1=sc.nextInt();
                int b2=sc.nextInt();
                map.get(b1).add(b2);
                map.get(b2).add(b1);
            }
            int cc=0;
            boolean[] visited=new boolean[v+1];
            for (int i = 1; i <= v; i++) {
                if(!visited[i]){
                    cc++;
                    dfs(i,visited,map);
                }
            }
            System.out.println(cc-1);
        }
    }
    public static void dfs(int s,boolean[] visited,Map<Integer, List<Integer>> map){
        if(visited[s]) return;
        visited[s]=true;
        for(int next:map.get(s)){
            if(!visited[next]){
                dfs(next,visited,map);
            }
        }
    }
}
