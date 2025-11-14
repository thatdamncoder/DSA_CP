package CodeForces;

import java.util.Scanner;

public class CatchTheCoin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(Math.max(Math.abs(x),Math.abs(y))<=Math.abs(y)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
