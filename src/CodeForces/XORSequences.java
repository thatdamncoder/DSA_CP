package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class XORSequences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long a=x^y;
            long ans=0;
            for (int i = 0; i < 64; i++) {
                if((a&1)==1){
                    ans=(1L <<i);
                    break;
                }
                a>>=1;
            }
            System.out.println(ans);
        }
    }
}
