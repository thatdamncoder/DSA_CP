package CodeForces;

import java.util.Scanner;

public class PhoneDesktop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int ones=sc.nextInt();
            int twos=sc.nextInt();
            int treq=(int)Math.ceil(twos*1.0/2);
            int rem=treq*7;
            if(twos%2!=0) rem+=4;
            if(rem<ones){
                treq+=(int)Math.ceil(1.0*(ones-rem)/15);
            }
            System.out.println(treq);
        }
    }
}
