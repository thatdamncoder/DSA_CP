package CodeForces;

import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="abc";
        s=" "+s;
        System.out.println(s.charAt(0));
        int num=1;
        while(num--!=0){
            String first= sc.next();
            String second= sc.next();
            first=first.toLowerCase();
            second=second.toLowerCase();
            if(first.length()!=second.length()){
                System.out.println((first.length()-second.length()<0)?-1:1);
                continue;
            }
            int diff=0;
            for (int i = 0; i < first.length(); i++) {
                diff=(int)first.charAt(i)-(int)second.charAt(i);
                if(diff!=0) {
                    diff=diff<0?-1:1;
                    break;
                }
            }
            System.out.println(diff);
        }
    }
}
