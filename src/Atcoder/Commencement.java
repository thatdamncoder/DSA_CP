package Atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class Commencement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            String s=sc.next();
            int[] count=new int[26];
            int[] arr=new int[s.length()+1];
            for(char ch:s.toCharArray()) count[ch-'a']++;
            boolean ok=true;
            for (int i = 0; i <26 && ok; i++) {
                if(count[i]<arr.length && count[i]!=0)
                    arr[count[i]]++;
            }
            for (int i = 1; i <= s.length() && ok; i++) {
                if(arr[i]!=0 && arr[i]!=2) ok=false;
            }
            System.out.println(ok?"YES":"NO");
        }
    }

}
