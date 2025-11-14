package CodeForces;

import java.util.Scanner;

public class _71A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String sarray[]=new String[n];
        for (int i = 0; i < n; i++) {
            sarray[i]= sc.next();
        }
        for (int i = 0; i < n; i++) {
            toolongwords(sarray[i]);
        }
    }

    private static void toolongwords(String s) {
        int r=s.length()-2;
        if(s.length()<=10) System.out.println(s);
        else System.out.println(s.charAt(0)+String.valueOf(r)+s.charAt(s.length()-1));
    }

}
