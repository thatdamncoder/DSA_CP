package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            String s=sc.next();
            Map<Character,Integer> map=new HashMap<>();
            for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
            System.out.println(map.size()%2!=0?"IGNORE HIM!":"CHAT WITH HER!");
        }
    }
}
