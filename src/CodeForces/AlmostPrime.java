package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlmostPrime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int count=0;
            for (int i = 1; i <= n; i++) {
                count+=get(i);
            }
            System.out.println(count);
        }
    }
    private static int get(int n){
        Set<Integer> set=new HashSet<>();
        while(n%2==0){
            set.add(2);
            n/=2;
        }
        boolean ok=true;
        for (int i = 3; i*i <= n; i+=2) {
            while(n%i==0){
                set.add(i);
                if(set.size()>2){
                    return 0;
                }
                n/=i;
            }
        }
        if(n>2) {
            set.add(n);
        }
        return set.size()==2?1:0;
    }
}
