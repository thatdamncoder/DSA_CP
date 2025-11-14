//package CodeForces;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class KirieAttacksTheEstate {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
//        while(num--!=0) {
//            int n = sc.nextInt();
//            a = new long[n + 1];
//            even = new long[n + 1];
//            odd = new long[n + 1];
//            parent = new int[n + 1];
//            tree = new ArrayList[n + 1];
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextLong();
//                tree[i] = new ArrayList<>();
//            }
//
//            for (int i = 0; i < n; i++) {
//                int u = sc.nextInt();
//                int v = sc.nextInt();
//                map[u].add(v);
//                tree[v].add(u);
//            }
//
//            int[] ans=new int[n];
//            dfs(1, 0,ans);  // root = 1, parent = 0 (no parent)
//
//            for (int i = 1; i <= n; i++) {
//                System.out.println(Math.max(even[i], odd[i]));
//            }
//        }
//    }
//
//    static int dfs(int s, int parent,int odd,int[] ans) {
//        int child=0;
//        for(int adjNode:map.get(s)){
//            if(adjNode!=parent){
//                child+=dfs(adjNode,s,1-odd,ans);
//
//            }
//        }
//        ans[s]+=s;
//        if(odd==0) ans[s]=Math.max(ans[s],ans[s]+child);
//        else ans[s]=Math.max(ans[s],child-ans[s]);
//        return ans[s];
//    }
//}
