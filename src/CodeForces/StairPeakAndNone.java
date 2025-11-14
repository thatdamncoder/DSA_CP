package CodeForces;

import java.util.Scanner;

public class StairPeakAndNone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a<b && b<c){
                System.out.println("STAIR");
            }
            else if(a<b && b>c){
                System.out.println("PEAK");
            }
            else System.out.println("NONE");
        }
    }
}
