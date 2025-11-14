package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleUndirectedBFS {
    public static void main(String[] args) {

    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[V];
        boolean ans=false;
        //note-check for all vertices
        //cycle means that at least one path is such that if i start from that node
        //i will come back to that node
        //so only calling dfs for the 0th node means that checking whether a cycle exists
        //from the 0th node
        //but what if there exists a cycle from another node
        //therefore check for all nodes as starting points

        for(int i=0;i<V;i++){
            if(!visited[i]){
                // ans=dfs(i,-1,visited,adj);
                ans=bfs(i,visited,adj);
                if(ans==true) return true;
            }
        }
        return false;
    }
    public boolean bfs(int u,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{u,-1});
        visited[u]=true;
        while(!queue.isEmpty()){
            int[] popped=queue.poll();
            for(int v:adj.get(popped[0])){
                if(v!=popped[1]){
                    if(!visited[v]){
                        queue.offer(new int[]{v,popped[0]});
                        visited[v]=true;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
