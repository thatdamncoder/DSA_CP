package CodeForces;

import java.util.Scanner;

public class FizzBuzzRemixed {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long n=sc.nextLong();
            long ans=(n/15) + (n-1)/15 + (n-2)/15;
            if(n>=2) ans+=3;
            else if(n>=1) ans+=2;
            else if(n>=0) ans+=1;
            System.out.println(ans);
        }
    }
}
