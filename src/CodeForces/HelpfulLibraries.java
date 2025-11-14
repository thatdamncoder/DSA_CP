package CodeForces;

import java.util.Scanner;

public class HelpfulLibraries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            String s=sc.next();
            int ones=0;
            int twos=0;
            int threes=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='1') ones++;
                if(s.charAt(i)=='2') twos++;
                if(s.charAt(i)=='3') threes++;
            }
            String ans="";
            while(ones!=0){
                ans=ans+1+"+";
                ones--;
            }
            while(twos!=0){
                ans=ans+2+"+";
                twos--;
            }
            while(threes!=0){
                ans=ans+3+"+";
                threes--;
            }
            System.out.println(ans.substring(0,ans.length()-1));
        }
    }
}
