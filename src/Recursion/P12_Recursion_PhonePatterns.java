package Recursion;

import java.util.ArrayList;

//FTS
//LEETCODE PROBLEM 17
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
//Considering 1 here
//Starting from 1(a,b,c) rather than 2(a,b,c)

public class P12_Recursion_PhonePatterns {
    public static void main(String[] args) {
       //phone("","23");
       //System.out.println(phonelistlc("",""));

        //for count-
        System.out.println(phonelistcount("","12"));
        System.out.println(phonelist("","12").size());
    }
    static void phone(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        int digit=ch-'0';   //converting '2' to 2 char to int
        char a='a';

        for (int j = (digit-1)*3; j < (digit*3); j++) {
            char add= (char) (a+j);
            phone(p+add,up.substring(1));
        }
    }
    static ArrayList<String> phonelist(String p, String up){
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        int digit=ch-'0';   //converting '2' to 2 char to int
        char a='a';
        ArrayList<String> ans= new ArrayList<>();
        for (int j = (digit-1)*3; j < (digit*3); j++) {
            char add= (char) (a+j);
            ans.addAll(phonelist(p+add,up.substring(1)));
        }
        return ans;
    }

    static int phonelistcount(String p, String up){
        int count=0;
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int digit=ch-'0';   //converting '2' to 2 char to int
        char a='a';

        for (int j = (digit-1)*3; j < (digit*3); j++) {
            char add= (char) (a+j);
            count=count+(phonelistcount(p+add,up.substring(1)));
        }
        return count;
    }

    //ACTUAL LEETCODE PROBLEM
    static ArrayList<String> phonelistlc(String p, String up){
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        int digit=ch-'0';
        int start= (digit-2)*3;

        //since 8 starts from 19 because 7 contains 4 elements so multiple of 3 + 1
        if(digit>7){
            start++;
        }

        //length of 7(pqrs) and 9(wxyz) is 4
        int uptill= (digit==7 || digit==9)?(4):(3);
        char a='a';

        ArrayList<String> ans= new ArrayList<>();
        for (int j = start; j < start+uptill; j++) {
            char add= (char) (a+j);
            ans.addAll(phonelistlc(p+add,up.substring(1)));
        }
        return ans;
    }

}
