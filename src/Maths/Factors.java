package Maths;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        int n=20;
        factors(n);
    }
    static void factors(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                if(n%i==i){
                    System.out.print(i + " ");
                }else {
                    System.out.println(i + " " + n / i);
                }
            }
        }
    }
    static void factorsprintinsortedorder(int n){
        List<Integer> list=new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                if(n%i==i){
                    System.out.print(i + " ");
                }else {
                    list.add(0,n/i);
                    System.out.print(i + " ");
                }
            }
        }
        System.out.print(list);
    }
}
