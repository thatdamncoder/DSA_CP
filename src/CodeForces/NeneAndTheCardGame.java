package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NeneAndTheCardGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a= sc.nextInt();
                map.put(a, map.getOrDefault(a,0)+1);
            }
            int count=0;
            for (int i :map.values()) {
                if(i==2) count++;
            }
            System.out.println(count);

        }
    }
}
