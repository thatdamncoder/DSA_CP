package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardExchange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            boolean ok=false;
            for(int i:map.values()){
                if(i>=k) ok=true;
            }
            if(!ok|| n<k) System.out.println(n);
            else System.out.println(k-1);
        }
    }
}
