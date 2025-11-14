package CodeForces;

import java.util.Scanner;

public class Prefrequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String t=sc.next();
            String s= sc.next();
            int j=0;
            for (int i = 0; i < m && j<n; i++) {
                if(s.charAt(i)==t.charAt(j)) j++;
            }
            System.out.println(j);
        }
    }
}
