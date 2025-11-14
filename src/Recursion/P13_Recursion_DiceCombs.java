package Recursion;

import java.util.ArrayList;

public class P13_Recursion_DiceCombs {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(dicelist("",4));
        System.out.println(dicelistface("",4,7));
    }
    static void dice(String p, int target){   //FTS
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> dicelist(String p, int target){   //FTS
        ArrayList<String> list= new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            ans.addAll(dicelist(p+i,target-i));
        }
        return ans;
    }
    static ArrayList<String> dicelistface(String p, int target,int face){   //FTS
        ArrayList<String> list= new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        for (int i = 1; i <=face && i<=target; i++) {
            ans.addAll(dicelistface(p+i,target-i,face));
        }
        return ans;
    }
}
