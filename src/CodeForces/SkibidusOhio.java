package CodeForces;

import com.sun.source.tree.ConstantCaseLabelTree;

import java.util.Scanner;

public class SkibidusOhio {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            boolean ok=false;
            for (int i = 0; i+1 <s.length() ; i++) {
                if(s.charAt(i)==s.charAt(i+1)){
                    ok=true;
                    break;
                }
            }
            if(ok) System.out.println(1);
            else System.out.println(s.length());
        }
    }
}
