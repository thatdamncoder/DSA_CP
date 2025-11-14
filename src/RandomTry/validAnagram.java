package RandomTry;

import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
//        System.out.println(validAnagram("nagaram","anagram"));
//        int index='n'-'a';
//        System.out.println(index);

    }
    static boolean validAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int scount[]=countChars(s);
        int tcount[]=countChars(t);
        System.out.println(Arrays.toString(scount));
        System.out.println(Arrays.toString(tcount));
        return Arrays.equals(scount,tcount);
    }
    static int[] countChars(String s){
        int count[]=new int[25];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            count[index]++;
        }
        return count;
    }
}
