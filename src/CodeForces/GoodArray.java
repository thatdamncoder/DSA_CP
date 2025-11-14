package CodeForces;

import java.util.*;

public class GoodArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            Map<Long,Integer> map=new HashMap<>();
            long sum=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                sum+=arr[i];
                map.put((long)arr[i],map.getOrDefault((long)arr[i],0)+1);
            }
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                sum-=arr[i];
                if(map.containsKey((long)arr[i])) map.put((long)arr[i],map.get((long)arr[i])-1);
                if(sum%2==0 && map.getOrDefault(sum/2,0)>0){
                   list.add(i);
                }
                sum+=arr[i];
                if(map.containsKey((long)arr[i])) map.put((long)arr[i],map.get((long)arr[i])+1);
            }
            System.out.println(list.size());
            for (int i : list) {
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }
    }
}
