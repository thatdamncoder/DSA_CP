package Graphs;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        List<List<Integer>> adj=new ArrayList<>();
        adj.add(Arrays.asList(1));
        adj.add(Arrays.asList(2,3));
        adj.add(Arrays.asList());
        adj.add(Arrays.asList(4));
        adj.add(Arrays.asList());
        adj.add(Arrays.asList(4));
        System.out.println(reachable(1,adj));
    }
    public static List<Integer> reachable(int s,List<List<Integer>> adj){
        List<Integer> list=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[adj.size()];
        visited[s]=true;
        queue.offer(s);
        while(!queue.isEmpty()){
            int popped=queue.poll();
            list.add(popped);
            for(int adjNode:adj.get(popped)){
                if(!visited[adjNode]){
                    queue.offer(adjNode);
                    visited[adjNode]=true;
                }
            }
        }
        return list;
    }
}
