package CodeForces;

import java.util.Scanner;

public class PermutationWarmUp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int h=n/2;
            long total= (long) n *(n+1)/2;
            long firsthalf= (long) h*(h+1)/2;
            long secondhalf=total-firsthalf;
            long ans=secondhalf-firsthalf;
            if(n%2!=0){
                ans-=(h+1);
            }
            System.out.println(ans+1);
        }
    }
}
