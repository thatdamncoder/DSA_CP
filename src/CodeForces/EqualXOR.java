package CodeForces;

import java.util.*;

public class EqualXOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer,Integer> map1=new HashMap<>();
            Map<Integer,Integer> map2=new HashMap<>();
            for (int i = 0; i < 2*n; i++) {
                int a=sc.nextInt();
                if(i<n) map1.put(a,map1.getOrDefault(a,0)+1);
                else map2.put(a,map2.getOrDefault(a,0)+1);
            }
            List<Integer> lista=new ArrayList<>();
            List<Integer> listb=new ArrayList<>();
            int k1=2*k;
            int k2=2*k;
            for(int i:map1.keySet()){
                if(k1>=2){
                    if(map1.get(i)==2){
                        lista.add(i); lista.add(i);
                        k1-=2;
                        map1.put(i,0);
                    }
                }
                else break;
            }
            for(int i:map2.keySet()){
                if(k2>=2){
                    if(map2.get(i)==2){
                        listb.add(i); listb.add(i);
                        k2-=2;
                        map2.put(i,0);
                    }
                }
                else break;
            }
            if(k1!=0 || k2!=0){
                for(int i:map1.keySet()){
                    if(k1==0 && k2==0) break;
                    if(map1.get(i)==1) {
                        if(k1!=0) lista.add(i);
                        if(k2!=0) listb.add(i);
                        k1--; k2--;
                    }
                }
            }
            for(int i:lista) System.out.print(i+" ");
            System.out.println();
            for(int i:listb) System.out.print(i+" ");
            System.out.println();

        }
    }
}
