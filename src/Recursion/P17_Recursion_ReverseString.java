package Recursion;

import java.lang.*;
import java.util.Arrays;

public class P17_Recursion_ReverseString {
    public static void main(String[] args) {
        //String s= revStr("","abcd");
        String s="abcd";
        System.out.println(s);
//        System.out.println(reverse("",s));


    }
    static String revStr(String p,String up,int end) {
        if (end==-1) {
            //System.out.println(p);
            return "";
        }
        char ch = up.charAt(end);
        //return revStr(p + up.charAt(end),up.substring(end+1,end+2));
        return "";
    }
    static String reverse(String p,String up){
        if(up.isEmpty()){
            return p;
        }
        char ch=up.charAt(0);

//        reverse(p,up.substring(1));
        return reverse(p,up.substring(1))+ch;

    }
}
