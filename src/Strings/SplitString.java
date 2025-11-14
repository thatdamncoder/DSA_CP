package Strings;

import CodeForces.ArrangingCats;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String s="Bob. hIt, baLl";
        s=s.toLowerCase();
        String[] arr=s.split("\\s+|[,\\.!?;:\\-]+");
        for(String w:arr){
            System.out.println(w);
        }
    }
}
