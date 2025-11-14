package CodeForces;

import java.util.Scanner;

public class Borze {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int num=1;
         while(num--!=0){
            String s=sc.next();
            String ans="";
            int n=s.length();
             for (int i = 0; i < n; ) {
                 if(s.charAt(i)=='-') {
                     if (i+1<n && s.charAt(i+1)=='.') ans+= 1;
                     else if(i+1< n && s.charAt(i+1)=='-') ans+= 2;
                     i+=2;
                 }else{
                     ans+=0;
                     i++;
                 }
             }
             System.out.println(ans);
         }
     }
}
