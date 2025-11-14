package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemGenerator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            Map<Character,Integer> map=new HashMap<>();
            for (int i = 0; i < 7; i++) {
                map.put((char) ('A'+i),0);
            }

            for (int i = 0; i < n; i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            long count=0;
            for (int i :map.values()) {
                if(i<m) count+=m-i;
            }
            System.out.println(count);
        }
    }

}
