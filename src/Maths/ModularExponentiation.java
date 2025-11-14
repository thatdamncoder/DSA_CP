package Maths;

public class ModularExponentiation {
    public static void main(String[] args) {
        int a=4;
        int b=16;
        int m=1000000007;
        System.out.println(calculatemod(a,b,m));
    }
    static int calculatemod(int a,int b,int m){
        if(b<=1) return 0;
        int ans=1;
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
