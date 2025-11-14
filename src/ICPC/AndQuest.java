package ICPC;

import java.util.*;

public class AndQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            SortedSet<Integer> set=new TreeSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(i);
            }
            for(int j=0;j<32;j++){
                for(int i=0;i<n;i++){
                    if(((k>>j)&1)==1) {
                        if (((arr[i] >> j) & 1)!=1) {
                            set.remove(i);
                        }
                    }
                }
            }
            int[] count=new int[32];
            boolean ok=true;
            for(int j=0;j<32;j++){
                for(int i:set){
                    count[j]+=((arr[i]>>j)&1);
                }
                if(((k>>j)&1)==0){
                    if(count[j]==set.size()) {
                        ok = false;
                        break;
                    }
                }
            }
            int a=-1;
            for(int i:set){
                a&=arr[i];
            }
            if(a!=k) ok=false;
            if(set.isEmpty() || !ok){
                System.out.println("NO");
            }
            else if(ok){
                System.out.println("YES");
                System.out.println(set.size());
                for(int i:set){
                    System.out.print((i+1)+ " ");
                }
                System.out.println();
            }

        }
    }
}
