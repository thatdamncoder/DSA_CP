package Recursion;

import java.util.ArrayList;
import java.util.List;


public class P10_Recursion_Subsequences {
    public static void main(String[] args) {
        String str="abbcccaa";
        subsets("",str);
        System.out.println(subsetsStored("",str));
        System.out.println(subsetsStoredWithArgs("",str,new ArrayList<String>()));
        System.out.println(subsetsStoredwithASCII("",str));
    }

    static void subsets(String p,String up){  //p-processed(answer) , up-unprocessed(original input string)
        if(up.isEmpty()){
            System.out.println(p);
           return;
        }
        subsets(p+up.charAt(0),up.substring(1));
        subsets(p,up.substring(1));
    }
    static ArrayList<String> subsetsStored(String p,String up){  //p-processed(answer) , up-unprocessed(original input string)
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        ArrayList<String> list1=subsetsStored(p+up.charAt(0),up.substring(1));
        ArrayList<String> list2=subsetsStored(p,up.substring(1));
        list1.addAll(list2);
        list.addAll(list1);
        return list;
    }


    //PROGRAM-return substrings of given string(up) in the form of ArrayList
    //Example- if up="abc"
    //Answer should be- [abc, ab, ac, a, bc, b, c, ]
    //p- processed string-answer
    //up- unprocessed string-original string passed
    static ArrayList<String> subsetsStoredWithArgs(String p,String up,ArrayList<String> list){
        if(up.isEmpty()) {
            list.add(p);
            return list;
        }
        subsetsStoredWithArgs(p + up.charAt(0), up.substring(1), list);
        subsetsStoredWithArgs(p, up.substring(1), list);
        return list;
    }
    static ArrayList<String> subsetsStoredwithASCII(String p,String up){
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        //ch+0 gives ASCII value
        ArrayList<String> list1=subsetsStoredwithASCII(p+ch,up.substring(1));
        ArrayList<String> list2=subsetsStoredwithASCII(p+(ch+0),up.substring(1));
        ArrayList<String> list3=subsetsStoredwithASCII(p,up.substring(1));
        list1.addAll(list2);
        list1.addAll(list3);
        list.addAll(list1);
        return list;
    }
}
