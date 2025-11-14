package Trees;

import java.util.*;

public class Djikstra {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(helper()));
    }
    public static int[] helper(){
        List<List<List<Integer>>> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int v=sc.nextInt();
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
            System.out.println("Enter no of nodes node " + i + " is connected to");
            int n=sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("Enter 'connectedNode-weight'");
                int node=sc.nextInt();
                int we=sc.nextInt();
                List<Integer> temp=new ArrayList<>();
                temp.add(node); temp.add(we);
                list.get(i).add(temp);
            }
        }
        System.out.println("Enter source vertex");
        int s=sc.nextInt();
        return djk(v,list,s);
    }
    //{{{1, 1}, {2, 6}}, {{2, 3}, {0, 1}}, {{1, 3}, {0, 6}}}

    public static int[] djk(int v,List<List<List<Integer>>> adj,int s){
        int[] result=new int[v];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[s]=0;
        PriorityQueue<int[]> queue=new PriorityQueue<>(
                (a,b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0])
        );
        queue.offer(new int[]{0,s});
        while(!queue.isEmpty()){
            int[] popped=queue.poll();
            int dist=popped[0];
            int source=popped[1];
            for(List<Integer> list:adj.get(source)){
                int d=list.get(1);
                int next=list.get(0);
                if(d+dist<result[next]){
                    result[next]=d+dist;
                    queue.offer(new int[]{d+dist,next});
                }
            }
        }
        return result;
    }
}
