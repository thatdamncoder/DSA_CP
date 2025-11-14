package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SquaresandCubes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int sq=(int)Math.pow(n,0.5);
            int max=sq*sq;
            int th=(int)Math.pow(n,0.33);
            int maxx=th*th*th;
            int s=(int)Math.pow(n,0.166);
            int maxxx=s*s*s*s*s*s;
            int ans=sq+th+s;
            System.out.println(ans+1);


        }
    }
}
