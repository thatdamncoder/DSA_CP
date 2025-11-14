package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMPStringMatching {
    public static void main(String[] args) {
//        String s="geeksforgeeks";
//        String t="geek";
//        String s="aaacaaaa";
//        String t="ababd";
//        StringBuilder sb=new StringBuilder(s);
////        System.out.println(kmp(s,t));
//        System.out.println(Arrays.toString(getLPSArray(s)));

        String s="ababa";
//        int[] lps=getLPSArray(s);
        System.out.println(getLongestCommonPrefixSuffix(s));

    }
    static List<Integer> kmp(String s, String t){
        List<Integer> list=new ArrayList<>();
        if(s.length()<t.length()) return list;
        int n=s.length();
        int m=t.length();
        int[] lps=getLPSArray(t);
        int i=0;
        int j=0;
        while(i<n){
            if(s.charAt(i)==t.charAt(j)){
                if(j==m-1) list.add(i-m+2);
                i++; j++;
                if(j==m) j=lps[m-1];
            }
            else{
                while(j!=0){
                    j=lps[j-1];
                    if(s.charAt(i)==t.charAt(j)){
                        i++; j++;
                        if(j==m) j=lps[m-1];
                        break;
                    }
                }
                if(j==0 && (s.charAt(i)!=t.charAt(j))){
                    i++;
                }
            }
        }
        return list;
    }
    static int[] getLPSArray(String t){
        //also called longest length of prefix,suffix that are equal
        //also called prefix array
        int[] lps=new int[t.length()];
        lps[0]=0;
        int length=0;
        for(int i=1;i<t.length();i++){
            if(t.charAt(length)==t.charAt(i)){
                length++;
                lps[i]=length;
            }
            else{
                while(length!=0 && t.charAt(i)!=t.charAt(length)) {
                    length = lps[length - 1];
                }
                if(t.charAt(length)==t.charAt(i)) lps[i]=++length;
            }
        }
        return lps;
    }
    static String getLongestCommonPrefixSuffix(String t) {
        int length = 0; // Length of longest common prefix suffix
        for (int i = 1; i < t.length(); i++) {
            if (t.charAt(length) == t.charAt(i)) {
                length++;
            } else {
                while (length != 0 && t.charAt(i) != t.charAt(length)) {
                    length = length - 1;
                }
                if (t.charAt(length) == t.charAt(i)) length++;
            }
        }
        // Extract the substring using the length of the longest common prefix suffix
        return t.substring(0, length);
    }
    public static long getbits(long s,long x){
        long i=1;
        long count=0;
        s=s>>>(x-1);
        while(s!=0){
            if((s&1)==1 && i%x==0)  count++;
            System.out.println(x);
            s=s>>>x;
            i+=x;
        }
        return count;
    }
}
