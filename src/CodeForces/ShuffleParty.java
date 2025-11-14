package CodeForces;

import java.util.Scanner;

public class ShuffleParty {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            if((n&(n-1))==0) System.out.println(n);
            else{
                int p=0;
                while(n>=2){
                    n=n/2;
                    p++;
                }
                System.out.println((int)Math.pow(2,p));
            }
        }
    }
}
