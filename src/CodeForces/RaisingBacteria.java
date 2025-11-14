package CodeForces;

import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            long x=sc.nextLong();
            long ans=0;
            while(x!=0){
                ans+=((x&1));
                x>>=1;
            }
            System.out.println(ans);
//            long ans=1;
//            while((ans<<1)<x){
//                ans=ans<<1;
//                if(ans==x) break;
//            }
////            System.out.println(1+ans-x);
//            if((ans<<1)==x) System.out.println(1);
//            else System.out.println(1 + x-ans);
//            System.out.println(536870911%2);
        }
    }
}
