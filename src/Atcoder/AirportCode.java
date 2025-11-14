package Atcoder;

import java.util.Locale;
import java.util.Scanner;

public class AirportCode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            String s=sc.next();
            String t=sc.next();
            t=t.toLowerCase();
            s=s.toLowerCase();
            int n=s.length();
            int j=0;
            for (int i = 0; i < n && j<3; i++) {
                if(s.charAt(i)==t.charAt(j))j++;
            }
            System.out.println((j==2 && t.charAt(2)=='x')||j==3?"YES":"NO");
        }
    }
}
