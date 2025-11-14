package RandomTry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestwithatmost2characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(maps(s));
    }
    static int maps(String s) {
        if(s.length()==1) return -1;
        Map<Character,Integer> map=new HashMap<>();
        int max=-1;
        int count=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.get(s.charAt(j))>3) count++;

            if(count<1){
                max=Math.max(max,j-i);
                j++;
            }
            else if(count>=1){
                while(i<s.length() && count!=2){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0) count--;
                    i++;
                }
                max=Math.max(max,j-i);
                j++;
            }
        }
        return max;
    }
}
