package RandomTry;

import java.util.ArrayList;

public class aMaNSubsets {
    public static void main(String[] args) {
        String s="aMaN";
        words("",s);
        System.out.println(wordssubsets("",s));
    }
    static void words(String p,String up){
        if(up.isEmpty()){
            if(p.startsWith("M") || p.startsWith("N")){
                System.out.println(p);
            }
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            words(first+ch+second,up.substring(1));
        }
    }
    static ArrayList<String> wordssubsets(String p, String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
//            if((p.startsWith("M") || p.startsWith("N"))) {
//                list.add(p);
//            }
            list.add(p);
            return list;
        }
        ArrayList<String> answer1= wordssubsets(p+up.charAt(0),up.substring(1));
        ArrayList<String> answer2= wordssubsets(p,up.substring(1));
        answer1.addAll(answer2);
        return answer1;
    }
}
