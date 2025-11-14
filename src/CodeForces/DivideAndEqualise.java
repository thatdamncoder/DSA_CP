package CodeForces;

import java.util.*;

public class DivideAndEqualise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                primefactorisation(arr[i],map);
            }
            boolean ok=true;
            for(int i:map.values()){
                if(i%n!=0){
                    ok=false;
                    break;
                }
            }
            System.out.println(ok?"YES":"NO");
        }
    }
    public static void primefactorisation(int n, Map<Integer,Integer> map){
            while(n%2==0){
                map.put(2,map.getOrDefault(2,0)+1);
                n/=2;
            }
            for (int i = 3; i*i <= n; i+=2) {
                while(n%i==0){
                    map.put(i,map.getOrDefault(i,0)+1);
                    n/=i;
                }
            }
            if(n>2) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
    }
}
