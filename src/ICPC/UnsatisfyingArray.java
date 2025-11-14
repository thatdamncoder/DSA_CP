package ICPC;

import java.util.*;

public class UnsatisfyingArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer, List<int[]>> map=new HashMap<>();
            for (int i = 0; i < k; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                map.putIfAbsent(a,new ArrayList<>());
                map.putIfAbsent(b+1,new ArrayList<>());
                map.get(a).add(new int[]{c,1});
                map.get(b+1).add(new int[]{c,-1});
            }
            Set<Integer> set=new HashSet<>();
            boolean ok=true;
            int[] arr=new int[n];
//            boolean[] taken=new boolean[n];
            for (int i = 1; i <= n; i++) {
                if(map.containsKey(i)){
                    for(int[] c:map.get(i)){
                        if(c[1]==-1) set.remove(c[0]);
                        else set.add(c[0]);
                    }
                }
                int c=Integer.MAX_VALUE;
                for (int j = 1; j <= n; j++) {
                    if(!set.contains(j)){
                        c=j;
                        break;
                    }
                }
                if(c==Integer.MAX_VALUE){
                    ok=false;
//                    System.out.println(i+" ");
//                    System.out.println(Arrays.toString(arr));
                    break;
                }
                else arr[i-1]=c;
            }
            if(!ok) System.out.println(-1);
            else{
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

        }
    }
}
