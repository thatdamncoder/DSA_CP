package RandomTry;

import java.util.Scanner;

public class maxdiffGCDLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long gcd=(long) Math.floor(n/2);
            long lcm=((long) n *(n-1));
            System.out.println(Math.abs(gcd-lcm));
        }

    }
}
