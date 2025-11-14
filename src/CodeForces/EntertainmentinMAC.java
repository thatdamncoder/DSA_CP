package CodeForces;

import java.util.Scanner;

public class EntertainmentinMAC {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int l=s.length();
            if(s.charAt(0)<=s.charAt(l-1)){
                System.out.println(s);
            }
            else{
                StringBuilder sb=new StringBuilder(s);
                sb.reverse();
                System.out.println(sb+s);
            }
        }
    }
}
