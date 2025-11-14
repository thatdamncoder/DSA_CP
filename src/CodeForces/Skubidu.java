package CodeForces;

import java.util.Scanner;

public class Skubidu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            String sub=s.substring(0,s.length()-2);
            sub+="i";
            System.out.println(sub);
        }
    }
}
