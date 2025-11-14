package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Countthevaluesofk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int l= sc.nextInt();
            Set<Integer> set=new HashSet<>();
            int ans=0;
            for (int i = 1; i<=l ; i++) {
                if(l%i==0){
                    set.add(i);
//                    set.add(l/i);
//                    ans+=isdiv(a,b,l/i);
//                    if(i!=l/i) ans+=isdiv(a,b,l/i);

                }
            }
            for(int i:set){
                ans+=isdiv(a,b,l/i);
            }
            System.out.println(ans);
        }
    }
    public static int isdiv(int a,int b,int l){
        for (int i = 1; i <=l ; i++) {
            if(l%i==0){
//                if(i==a || l/i==a || i==b || l/i==b ) return 1;
                if(i==a || i==b) return 1;
            }
        }
        return 0;
    }

}
