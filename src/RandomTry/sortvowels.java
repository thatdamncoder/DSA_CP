package RandomTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortvowels {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(0));
            list.remove(0);
        }
        System.out.println(list);

    }
    static String sort(String s) {
        List<Character> vowels = getVowels(s);
        if(vowels.isEmpty()){
            return s;
        }
        Collections.sort(vowels);
        System.out.println(vowels);
        int index=0;
        char[] chararr=s.toCharArray();
        for(int i=0;i<chararr.length;i++){
            if(vowels.contains(chararr[i])){
                chararr[i]=vowels.get(index++);
            }
        }
        return String.valueOf(chararr);
    }

    private static List<Character> getVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            String chstr=String.valueOf(s.charAt(i));
            if(
                    chstr.equalsIgnoreCase("A") ||
                            chstr.equalsIgnoreCase("E") ||
                            chstr.equalsIgnoreCase("I") ||
                            chstr.equalsIgnoreCase("O") ||
                            chstr.equalsIgnoreCase("U")
            ){
                vowels.add(s.charAt(i));
            }
        }
        System.out.println(vowels);
        return vowels;
    }

    static void sortASCII(List<Character> vowels){
        for (int i = 0; i < vowels.size(); i++) {
            int asci=vowels.get(i)-'a';
            for (int j = 0; j < vowels.size(); j++) {
                int ascj=vowels.get(j)-'a';
                if(asci<ascj){
                    char temp=vowels.get(i);
                    vowels. set(i,vowels.get(j));
                    vowels.set(j,temp);
                }
            }
        }
    }
}
