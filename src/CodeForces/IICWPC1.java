package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IICWPC1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String one= sc.next();
            String two=sc.next();
            int m=sc.nextInt();
            for (int i = 0; i < m; i++) {
                String a=sc.next();
                boolean c1=check(a,one);
                boolean c2=check(a,two);
                if((c1 || c2) ) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        }
    }
    public static boolean check(String a, String b){
        if(a.length()!=b.length()) return false;
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char c1=a.charAt(i);
            char c2=b.charAt(i);
            map1.putIfAbsent(c1,c2);
            if(map1.get(c1)!=c2) return false;
            map2.putIfAbsent(c2,c1);
            if(map2.get(c2)!=c1) return false;
        }
        return true;
    }
}
