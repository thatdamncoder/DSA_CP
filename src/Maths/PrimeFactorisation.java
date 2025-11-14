package Maths;

import java.util.*;
//smallest factor (>1) of any number (>1) is prime
public class PrimeFactorisation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            while(n%2==0){
                list.add(2);
                n/=2;
            }
            for (int i = 3; i*i <= n; i+=2) {
                while(n%i==0){
                    list.add(i);
                    n/=i;
                }
            }
            if(n>2) {
                list.add(n);
            }
            System.out.println(list);
        }
    }
}
