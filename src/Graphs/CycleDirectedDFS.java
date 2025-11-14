package Graphs;

import java.util.ArrayList;

public class CycleDirectedDFS {
    public static void main(String[] args) {

    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[V];
        boolean[] isInRecursion=new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i] && dfs(i,visited,isInRecursion,adj)) return true;

        }
        return false;
    }
    public boolean dfs(int u,boolean[] visited,boolean[] isInRecursion,ArrayList<ArrayList<Integer>> adj) {
        visited[u]=true;
        isInRecursion[u]=true;

        for(int v: adj.get(u)){
            if(!visited[v]){
                // visited[v]=true;
                // isInRecursion[v]=true;
                if(dfs(v,visited,isInRecursion,adj)) return true;
            }
            else{
                if(isInRecursion[v]) return true;
                // else{
                //     if(dfs(v,visited,isInRecursion,adj)) return true;
                // }
            }
        }
        isInRecursion[u]=false;
        return false;
    }
}
