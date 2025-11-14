package CodeForces;

import java.util.Scanner;

public class _01Treess {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            boolean yes=true;
            for (int i = 0; i < n; i++) {
                int ele=sc.nextInt();
                ele=ele-(i+1);
                if(ele<0) yes=false;
            }
            System.out.println((yes)?"YES":"NO");
        }
//wrong
    }
}
