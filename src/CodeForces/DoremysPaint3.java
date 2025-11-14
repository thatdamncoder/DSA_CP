package CodeForces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DoremysPaint3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            if(map.size()>2) System.out.println("No");
            else if(map.size()==1) System.out.println("Yes");
            else{
                int a=-1;
                int b=-1;
                for(int val:map.values()) {
                    if (a == -1) a = val;
                    else b = val;
                }
                if(n%2==0 && a==b) System.out.println("Yes");
                else if(n%2!=0 && Math.abs(a-b)==1) System.out.println("Yes");
                else System.out.println("No");
            }

        }
    }
}
