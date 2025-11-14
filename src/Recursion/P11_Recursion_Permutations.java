package Recursion;

import java.util.ArrayList;
import java.util.List;

public class P11_Recursion_Permutations {
    public static void main(String[] args) {
        String s="abc";
        permutations("",s);
        System.out.println(permutationsList("",s));
        System.out.println(permutationsCount("",s));



    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        //Number of recursive calls = length of p + 1
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second= p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }

    static List<String> permutationsList(String p, String up){
        List<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        List<String> allAnswersbefore= new ArrayList<>();
        //Number of recursive calls = length of p + 1
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second= p.substring(i,p.length());
            allAnswersbefore.addAll(permutationsList(first+ch+second,up.substring(1)));
        }
        return allAnswersbefore;
    }

    //For verification use formula factorial(str.length())
    static int permutationsCount(String p, String up){
        int count=0;
        if(up.isEmpty()){
            count=count+1;  //or return 1;
            return count;
        }
        char ch=up.charAt(0);
        int ans=0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second= p.substring(i,p.length());
            ans = ans+ permutationsCount(first+ch+second,up.substring(1));
        }
        return ans;
    }

}
