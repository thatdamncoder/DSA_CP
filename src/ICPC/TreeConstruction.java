package ICPC;

import java.util.*;
public class TreeConstruction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            if(solve1()==-1){
                System.out.println(-1);
            }
        }
    }

    public static int solve1(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int l=sc.nextInt();
        int nodes=n;
        Map<Integer,Set<Integer>> map=new HashMap<>();
        int a=l+1;
        for (int i = 1; i <=l ; i++) {
            map.putIfAbsent(i,new HashSet<>());
            map.putIfAbsent(a,new HashSet<>());
            map.get(i).add(a);
            map.get(a).add(i);
        }
        int curr=l+1;
        nodes-=l+2;
//        if(nodes<0) {
//            System.out.println(1);
//            return -1;
//        }
//        if(nodes-(d+1)<0) {
//            System.out.println(2);
//            return -1;
//
//        }
        d--;
        while(d>1) {
            d--;
            map.putIfAbsent(curr, new HashSet<>());
            map.putIfAbsent(curr+1, new HashSet<>());
            map.get(curr).add(curr+1);
            map.get(curr+1).add(curr);

            curr++;
        }
        int root=curr-1;
        System.out.println(root);
        map.putIfAbsent(root,new HashSet<>());
        for (int i = curr+1; i <=n ; i++) {
            map.putIfAbsent(i,new HashSet<>());
            map.get(root).add(i);
            map.get(i).add(root);
        }
        if(map.size()!=n) return -1;
//        System.out.println(map);
        Map<Integer,List<Integer>> ans= new HashMap<>();
        bfs(root,map,ans);
        return 0;
    }

    public static void bfs(int s,Map<Integer,Set<Integer>> map,Map<Integer,List<Integer>> ans){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{s,1});
        int curr=2;
        Set<Integer> visited=new HashSet<>();
        visited.add(s);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                int[] popped = queue.poll();
                int orig=popped[0];
                int ind=popped[1];
//                System.out.println(orig+" "+ind);
                ans.putIfAbsent(ind, new ArrayList<>());
                for (int c : map.get(orig)) {
                    if(!visited.contains(c)) {
                        visited.add(c);
                        ans.get(ind).add(curr);
//                        System.out.println(orig+ " " +ind+ " "+c+" " + curr );
                        queue.offer(new int[]{c, curr});
                        curr++;
                    }
                }
            }
        }
        for(int key:ans.keySet()){
            for(int i:ans.get(key)){
                System.out.println(key+" " +i);
            }
        }
    }

}
