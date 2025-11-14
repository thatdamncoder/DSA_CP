package CodeForces;

import java.util.*;

public class BeautifulArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            List<Integer> list=new ArrayList<>();
            for(int key:map.keySet()){
                if(map.get(key)%2!=0) list.add(key);
            }
            if(list.size()==0) System.out.println(-1);
            else if(list.size()==1) System.out.println(0);
            else{
                long odd=0;
                long even=0;
                Collections.sort(list);
                int ok=0;
                for (int i = 0; i+1 < list.size(); i++){
                    int d=list.get(i+1)-list.get(i);
                    if(d>k && d%k!=0){
                        ok=-1;
                        break;
                    }
                    if(d==k) d=0;
                    if(i%2==0) even+=d;
                    else odd+=d;
                }
                if(list.size()%2==0) System.out.println(even);

            }
        }
    }
}
