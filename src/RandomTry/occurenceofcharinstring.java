package RandomTry;

import java.util.*;

public class occurenceofcharinstring {
    public static void main(String[] args) {
//        char[] arr={'a','a','a','a','b','b','b','b','b','b','b','b','b','b','c','c','c'};
//        System.out.println(Arrays.toString(arr));
//        chars(arr);
//        System.out.println(Arrays.toString(arr));
//        int n=101115;
//        System.out.println((int)Math.log10(n)+1);
        String s="abc";
        System.out.println(stringcompression2(s,2));
    }
    static String getstring(String s){
        String ans="";
        int count=0;
        char ele=s.charAt(0);
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=ele) {
                ans = ans + ele + count;
                count = 0;
                ele = s.charAt(i);
            }
            count++;
        }
        ans = ans + ele + count;
        return ans;
    }
    static void chars(char[] arr){
        int count=0;
        char ele=arr[0];
        int i;
        int ptr=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=ele){
                arr[ptr++]=ele;
                if(count!=1){
                    count=rev(count);
                    while(count!=0){
                        arr[ptr++]=(char)(count%10+'0');
                        count=count/10;
                    }
                }
                ele=arr[i];
                count=0;
            }
            count++;
        }
        arr[ptr++]=ele;
        if(count!=1){
            while(count!=0){
                arr[ptr++]=(char)(count%10+'0');
                count=count/10;
            }
        }
        int length=ptr;
        for(i=ptr;i<arr.length;i++){
            arr[i]=' ';
        }
    }
    static int rev(int count){
        int rev=0;
        int r=0;
        int orig=count;
        while(orig!=0){
            r=orig%10;
            rev=rev*10+r;
            orig=orig/10;
        }
        return rev;
    }
    static int stringcompression2(String s,int k){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int[] arr=new int[map.size()];
        int index=0;
        for(int i:map.values()){
            arr[index++]=i;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int length=0;
        int i=0;

        while (i<arr.length && k!=0) {
            System.out.println(i);
            k = k - arr[i];
            arr[i] = 0;
            if (k <= 0) {
                length=arr.length-i;
                if(k==0) {
                    length--;
                }
                if (k < 0) {
                    arr[i] = Math.abs(k);
                    k = 0;
                }
            }
            i++;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                length+=(int)Math.log10(arr[i])+1;
            }
        }
        return length;
    }
    static int stringcompression3(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int[] arr = new int[map.size()];
        int index = 0;
        for (int i : map.values()) {
            arr[index++] = i;
        }

        Arrays.sort(arr);
        int length = 0;

        for (int i = 0; i < arr.length;) {
            if (k != 0) {
                while (i<arr.length && k != 0) {
                    k = k - arr[i];
                    arr[i] = Math.max(0, arr[i] - k);
                    if (k <= 0) {
                        k = 0;
                        length += arr.length - i;
                    }
                    else {
                        i++;
                    }
                }
            } else {
                length += (int) Math.log10(arr[i]) + 1;
                i++;
            }
        }

        return length;
    }
}
