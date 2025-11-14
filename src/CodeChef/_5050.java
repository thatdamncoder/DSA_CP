package CodeChef;

import java.util.Scanner;
/*
Z grade, if their attendance is strictly less than
50
%
50% .
F grade, if they score strictly less than
50
%
50% marks, given that their attendance is greater than or equal to
50
%
50% .
A grade, otherwise.
 */
public class _5050 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int m=sc.nextInt();

            if(a<50) System.out.println("Z");
            else if(m<50 && a>=50) System.out.println("F");
            else System.out.println("A");
        }
    }
}
