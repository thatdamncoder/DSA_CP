package CodeForces;

import java.util.Scanner;

public class HardCompare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();
            if(a==c && b>d) System.out.println("YES");
            else if(a>c && b>d) System.out.println("YES");
            else if(a<c && b<d) System.out.println("NO");
            else{
                long ans1=calculatemod(a,b,(int)1e9+7);
                long ans2=calculatemod(c,d,(int)1e9+7);
                System.out.println(ans1>ans2?"YES":"NO");
            }
        }
    }
    static long calculatemod(long a,long b,int m){
        if(b<=1) return 0;
        long ans=1;
        while(b!=0){
            if((b&1)==1){
                ans=(ans*a)%m;
            }
            a*=a;
            b>>=1;
        }
        return ans;
    }
}
