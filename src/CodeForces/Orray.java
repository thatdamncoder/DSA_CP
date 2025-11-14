package CodeForces;

import java.util.*;

public class Orray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int max=0;
            Map<Integer,Integer> freq=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                max=Math.max(max,arr[i]);
                freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            }
            Map<Integer, Set<Integer>> map=new HashMap<>();
            for (int k = 0; k < 32; k++) {
                for (int i = 0; i < n; i++) {
                    int bit=(arr[i]>>k)&1;
                    if(bit==1){
                        if(!map.containsKey(k)) map.put(k,new HashSet<>());
                        map.get(k).add(arr[i]);
                    }
                }
            }
            List<Integer> ans=new ArrayList<>();
            add(max,freq.get(max),ans);
            for (int i= 31; i >=0; i--) {
                if(((max>>i)&1)==0) {
                    if(map.containsKey(i)) {
                        ans.addAll(map.get(i));
                        map.get(i).clear();
                    }
                }
            }
            for (int i= 31; i>=0; i--) {
                if (((max >> i) & 1) == 1) {
                    if (map.containsKey(i)) ans.addAll(map.get(i));
                }
            }
            for(int a:ans) System.out.print(a + " ");
            System.out.println();
        }
    }
    public static void add(int ele,int f,List<Integer> ans){
        for (int i = 0; i < f; i++) {
            ans.add(ele);
        }
    }
}
