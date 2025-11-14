//package Graphs;
//
//import java.util.ArrayList;
//
//public class CycleUndirectedDFS {
//    public static void main(String[] args) {
////        {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}}
//        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
//        for (int i = 0; i < 5; i++) {
//            adj.add(new ArrayList<>());
//        }
//        adj.get(0).add(1);
////        adj.get(1).add([0,2,4]);
//
//
//
//    }
//    public static boolean dfs(){
//        boolean[] visited=new boolean[V];
//        boolean ans=false;
//        //note-check for all vertices
//        //cycle means that at least one path is such that if i start from that node
//        //i will come back to that node
//        //so only calling dfs for the 0th node means that checking whether a cycle exists
//        //from the 0th node
//        //but what if there exists a cycle from another node
//        //therefore check for all nodes as starting points
//
//        for(int i=0;i<V;i++) {
//            if (!visited[i]) {
//                ans = dfs(i, -1, visited, adj);
//                if (ans == true) break;
//            }
//        }
//    }
//}
