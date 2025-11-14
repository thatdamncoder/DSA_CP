package Trees;

import java.util.*;

public class SubtreequerySolver {

    public static void main(String[] args) {

    }
    static Map<Integer, List<Integer>> tree = new HashMap<>();
    static Map<Integer, Integer> subtreeSize = new HashMap<>();
    static int[] finalAnswer(int n, int[][] edges, int m, int[][] queries){
        for (int[] edge : edges) {
            tree.putIfAbsent(edge[0], new ArrayList<>());
            tree.putIfAbsent(edge[0], new ArrayList<>());
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }
        dfs(1, -1);

        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int x = queries[i][0];
            int k = queries[i][1];

            List<Integer> sizes = new ArrayList<>();
            for (int child : tree.getOrDefault(x, new ArrayList<>())) {
                sizes.add(subtreeSize.get(child));
            }
            sizes.add(1);
            Collections.sort(sizes);

            result[i] = k <= sizes.size()? sizes.get(k - 1) : -1;
        }
        return result;

    }

    static int dfs(int node, int parent) {
        int size = 1;
        for (int child : tree.getOrDefault(node, new ArrayList<>())) {
            if (child != parent) {
                size += dfs(child, node);
            }
        }
        subtreeSize.put(node, size);
        return size;
    }

}

