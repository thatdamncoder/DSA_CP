package ICPC;

import java.util.*;

public class CountPeriodicNumbers {
    static boolean done=false;
    public static void main(String[] args){
        if(!done) solve();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int count=0;
            for (int i = 1; i < 32; i++) {
                if(!map.get(i).isEmpty()) {
                    count+=findrange(map.get(i),l,r);
                }
            }
            System.out.println(count);
        }
    }
    static Map<Integer,List<Integer>> map=new HashMap<>();
    public static void solve(){
        done=true;

        for (int k = 1; k <32; k++) {
            int curr = 0;
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < 32; i += k) {
                int l = k;
                while (l-- != 0) {
                    curr|=(1<<i);
                    i++;
                }
                list.add(curr);
            }
            curr=0;
            for (int i = k; i< 32; i += k) {
                int l = k;
                while (l-- != 0) {
                    curr |= (1 << i);
                    i++;
                }
                list.add(curr);
            }
            Collections.sort(list);
            map.put(k,list);
        }
    }
    public static int findrange(List<Integer> list,int l,int r){
        int left=Collections.binarySearch(list,l);
        if(left<0) left=-left-1;
        int right=Collections.binarySearch(list,r);
        if(right<0)  right = -right - 1;
        else right += 1;
        return right-left;
    }
}
