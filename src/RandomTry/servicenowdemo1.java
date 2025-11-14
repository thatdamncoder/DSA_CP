package RandomTry;

import java.util.Arrays;
import java.util.Scanner;

public class servicenowdemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ans=solve(s);
        if(ans=='#') System.out.println(-1);
        else System.out.println(ans);
    }
    static char solve(String s){
        if(s.isEmpty()) return '#';
        int n=s.length();
        String brr="";
        String brreven="";
        String brrodd="";
        for (int i = 0; i < n; i++) {
            if(i%2==0) brreven+=s.charAt(i);
            else brrodd+=s.charAt(i);
        }
        brr=brreven+brrodd;

        int[] count=new int[26];
        Arrays.fill(count,0);
        for (int i = 0; i < n; i++) {
            count[brr.charAt(i)-'a']++;
        }
        for (int i = 0; i < n; i++) {
            if(count[brr.charAt(i)-'a']<=1) return brr.charAt(i);
        }
        return '#';
    }
}
