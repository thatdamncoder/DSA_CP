package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yetanotherbrokenkeyboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s= sc.next();
            StringBuilder sb=new StringBuilder(s);
            int cap=-1;
            int prevcap=-1;
            int small=-1;
            int prevsmall=-1;
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < sb.length(); i++) {
                if(cap!=-1 && s.charAt(i)=='B') {
                    list.add(cap);
                    cap=prevcap;
                }
                else if(small!=-1 && s.charAt(i)=='b'){
                    list.add(small);
                    small=prevsmall;
                }
                else {
                    if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                        prevsmall = small;
                        small = i;
                    } else {
                        prevcap = cap;
                        cap = i;
                    }
                }
            }
            for (int i=0;i<sb.length();i++) {
                if(!list.contains(i) && sb.charAt(i)!='B' && s.charAt(i)!='b') System.out.print(sb.charAt(i));
            }
            System.out.println();
        }
    }
}
