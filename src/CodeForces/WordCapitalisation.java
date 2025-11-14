package CodeForces;


import java.util.Scanner;

public class WordCapitalisation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            String s=sc.next();
            String t=s.substring(0,1).toUpperCase();
            System.out.println(t+s.substring(1));
        }
    }
}
