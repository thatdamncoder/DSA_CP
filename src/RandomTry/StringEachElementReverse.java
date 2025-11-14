package RandomTry;

import java.util.Arrays;

public class StringEachElementReverse {
    public static void main(String[] args) {
        String s="I am the best";
        strRev(s);

        System.out.println("0"+4);
    }
    static void strRev(String s){
        System.out.println(s);
        char[] chararr=s.toCharArray();
        System.out.println(Arrays.toString(chararr));
        System.out.println(s.length()-1);
        int start=0;
        int end=s.length()-1;

        while(start<=end){
            char temp=chararr[start];
            chararr[start]=chararr[end];
            chararr[end]=temp;
            start++;
            end--;
        }
        String strjoin = "";
        for(char ch:chararr) {
            strjoin=strjoin+String.valueOf(ch);
        }
        System.out.println(strjoin);

    }
}
