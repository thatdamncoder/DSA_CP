package CodeChef;

import java.util.Scanner;

public class SwappingMarksDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int reva=(a % 10) * 10 + (a / 10);
            int revb=(b % 10) * 10 + (b / 10);
            if(a>b || reva>b || reva>revb) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
