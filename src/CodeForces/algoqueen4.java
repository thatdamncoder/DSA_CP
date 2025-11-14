package CodeForces;

import java.util.*;

public class algoqueen4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int r=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int[][] dist=new int[d][2];
            for (int i = 0; i < d; i++) {
                dist[i][0]=sc.nextInt();
                dist[i][1]=sc.nextInt();
            }
            int que=sc.nextInt();
            int[][] q=new int[que][3];
            for (int i = 0; i < que; i++) {
                q[i][0]=sc.nextInt();
                q[i][1]=sc.nextInt();
                q[i][2]=sc.nextInt()-1;
            }
            Arrays.sort(q,(a,b) -> (a[2]-b[2]));
            Map<Integer, List<Integer>> map=new HashMap<>();
            int j=0;
            for (int i = 0; i < d && j<que; i++) {
                int x=dist[i][0];
                int y=dist[i][1];
                map.putIfAbsent(x,new ArrayList<>());
                map.get(x).add(y);
                if(q[j][2]<=i){
                    int xx=q[j][0];
                    int yy=q[j][1];
                    boolean ok=check(xx,yy,map) && check(xx+1,yy,map) && check(xx,yy+1,map) && check(xx+1,yy+1,map);
                    System.out.println(ok?"Yes":"No");
                    j++;
                }
            }
        }
    }
    public static boolean check(int x,int y,Map<Integer, List<Integer>> map){
        return !map.getOrDefault(x,Collections.emptyList()).contains(y);
    }
}
