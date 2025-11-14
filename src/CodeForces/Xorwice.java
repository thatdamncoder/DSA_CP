package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Xorwice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a^b);
        }
    }
}
