package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DFS {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> withoutmap(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[adj.size()];
        dfswithoutmap(adj,0,visited,list);
        return list;
    }
    public static void dfswithoutmap(ArrayList<ArrayList<Integer>> adj,int u,boolean[] visited,ArrayList<Integer> list){
        if(visited[u]) return;
        visited[u]=true;
        list.add(u);
        for(int v:adj.get(u)){
            // if(!visited[v])
            dfswithoutmap(adj,v,visited,list);
        }
    }

    //with map
    public static ArrayList<Integer> withmap(int v, ArrayList<ArrayList<Integer>> adj) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<v;i++){
            map.put(i,adj.get(i));
        }
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[v];
        dfsmap(map,0,visited,list);
        return list;
    }
    public static void dfsmap(Map<Integer,ArrayList<Integer>> map, int u, boolean[] visited, ArrayList<Integer> list){
        if(visited[u]) return;
        visited[u]=true;
        list.add(u);
        for(int v:map.get(u)){
            if(!visited[v]) dfsmap(map,v,visited,list);
        }
    }
}
