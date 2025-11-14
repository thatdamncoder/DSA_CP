package CodeChef;

import java.util.Scanner;

public class FootBallTies {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(Math.min(a%3,b%3));
        }
    }
}
