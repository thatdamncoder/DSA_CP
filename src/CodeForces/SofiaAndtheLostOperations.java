package CodeForces;

import java.util.*;

public class SofiaAndtheLostOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            long[] copy=new long[n];
            Map<Long,Long> want=new HashMap<>();
            Set<Long>  set=new HashSet<>();
//            Map<Long,Long> have=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            long dec=0;
            for (int i = 0; i < n; i++) {
                copy[i]=sc.nextLong();
                set.add(copy[i]);
                if(copy[i]!=arr[i]) want.put(copy[i],want.getOrDefault(copy[i],0L)+1);

            }
            long c=want.size();
            c-=dec;
            int k1=sc.nextInt();
            long[] k=new long[k1];
            for (int i = 0; i < k1; i++) {
                k[i] = sc.nextLong();
            }
            boolean ok=true;

            for (int i = 0; i < k1 && ok; i++) {
                if(want.containsKey(k[i])){
                    if(want.get(k[i])>0 && c>0) {
                        want.put(k[i],want.get(k[i])-1);
                        if(want.get(k[i])==0) c--;
//                        else ok=true;
                    }
                }
                else{
                    if(!set.contains(k[i]) && !set.contains(k[k1-1])) ok=false;
                }
//                have.put(k[i],have.getOrDefault(k[i],0L)+1);
            }
//            if(!ok && want.containsKey(k[k1-1])) ok=true;
            if(c>0) ok=false;
            System.out.println(ok?"YES":"NO");
    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        while(num--!=0){
//            int n=sc.nextInt();
//            long[] arr=new long[n];
//            long[] copy=new long[n];
//            Map<Long,Long> want=new HashMap<>();
//            Map<Long,Long> have=new HashMap<>();
//            Set<Long> set=new HashSet<>();
//            Map<Long,int[]> index=new HashMap<>();
//            for (int i = 0; i < n; i++) {
//                arr[i]=sc.nextLong();
//            }
//            for (int i = 0; i < n; i++) {
//                copy[i]=sc.nextLong();
//                set.add(copy[i]);
//                if(copy[i]!=arr[i]) want.put(copy[i],want.getOrDefault(copy[i],0L)+1);
//            }
//            int k1=sc.nextInt();
//            long[] k=new long[k1];
//            for (int i = 0; i < k1; i++) {
//                k[i]=sc.nextLong();
//                if(!index.containsKey(k[i])) index.put(k[i],new int[]{-1,-1});
//                index.get(k[i])[0]=index.get(k[i])[0]==-1?i:index.get(k[i])[0];
//                index.get(k[i])[1]=Math.max(index.get(k[i])[1],i);
//                have.put(k[i],have.getOrDefault(k[i],0L)+1);
//            }
//            boolean ok=true;
//            for (long key:want.keySet()){
//                if(!have.containsKey(key) || want.get(key)>have.get(key)) {
//                    ok=false;
//                    break;
//                }
//            }
//            if(!ok) {
//                System.out.println("NO");
//            }
//            else{
//                boolean check=false;
//                int f=0;
//                for (int i = 0; i < n; i++) {
//                    if (arr[i] != copy[i]) {
//                        have.put(copy[i], have.get(copy[i]) - 1);
//                        want.put(copy[i], want.get(copy[i]) - 1);
//                        if (want.get(copy[i]) <= 0) want.remove(copy[i]);
//
//                    }
//                    if (want.isEmpty()) {
//                        f=i;
//                        check=true;
//                        break;
//                    }
//                }
//                if(check){
//                    for(long key:have.keySet()){
//                        if(have.get(key)>0 && !set.contains(key) && (index.get(key)[0]>f || index.get(key)[1]>f)){
//                            ok=false;
//                            break;
//                        }
//                    }
//                }
////                if(!want.isEmpty()) ok=false;
//                System.out.println(ok?"YES":"NO");
//            }
//        }
    }
}
