package AOALab;

import java.util.*;

public class DistKFromNode {
    //Q. print all nodes from source node at a distance of k
    //trick- if it was shortest distance from source, it would be bfs, but here dfs will work
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        map.put(1,Arrays.asList(2,3,6));
        map.put(2,Arrays.asList(1,4,5));
        map.put(3,Arrays.asList(1,6,7));
        map.put(4,Arrays.asList(2,8));
        map.put(5,Arrays.asList(2,8));
        map.put(6,Arrays.asList(1,3,7));
        map.put(7,Arrays.asList(3,6));
        map.put(8,Arrays.asList(4,5));
        bfs(1,2,map);
    }
    public static void bfs(int s,int k, Map<Integer, List<Integer>> map){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[map.size()];
        queue.offer(s);
        visited[s]=true;
        int t=0;
        Set<Integer> set=new HashSet<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size--!=0){
                int popped=queue.poll();
                if(t==k){
                    set.add(popped);
                    continue;
                }
                for(int adjNode:map.get(popped)){
                    if(!visited[adjNode]){
                        visited[adjNode]=true;
                        queue.offer(adjNode);
                    }

                }
            }
            t++;
            if(t>k) break;
        }
        System.out.println(set);
    }
    public static void helper(int s,int k,Map<Integer,List<Integer>> map){
        for(int adjNode:map.get(s)){
            boolean[] visited=new boolean[map.size()];
            visited[s]=true;
            dfs(adjNode,k-1,visited,map);
        }
    }
    public static void dfs(int s,int k,boolean[] visited, Map<Integer,List<Integer>> map){
        if(k==0){
            System.out.println(s);
            return;
        }
        visited[s]=true;
        for(int adjNode:map.get(s)){
            if(!visited[adjNode]){
                dfs(adjNode,k-1,visited,map);
            }
        }
    }
}
