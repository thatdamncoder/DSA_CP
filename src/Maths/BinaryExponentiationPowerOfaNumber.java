package Maths;

public class BinaryExponentiationPowerOfaNumber {
    public static void main(String[] args) {
        int a=3;
        int power=8;
        System.out.println(binaryexpo(a,power));
    }
    public static long rec(int a,int n){
        if(n==0) return 1;
        if(n==1) return a;
        long temp=rec(a,n/2);
        temp*=temp;
        if((n&1)==1) temp*=a;
        return temp;
    }
    public static long binaryexpo(int a,int power){
        long result=1L;
        while(power!=0){
            if((power&1)==1) result*=a;
            a=a*a;
            power>>=1;
        }
        return result;
    }
}
