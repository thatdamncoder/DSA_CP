package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectlyBalancedString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int n=s.length();
            int[] count=new int[26];
            int d=n;
            for (int i = 0; i < n; i++) {
                if(count[s.charAt(i)-'a']!=0) count[s.charAt(i)-'a']--;
                count[s.charAt(i)-'a']+=(i+1)*d;
                d--;
            }
            Arrays.sort(count);
            int i=0;
            while(i<26 && count[i]==0) i++;
            boolean ok=count[25]-count[i]<=1;
            System.out.println(ok?"YES":"NO");
        }
    }
}
