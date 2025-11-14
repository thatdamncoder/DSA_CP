package Maths;

public class GCDeuclidean {
    public static void main(String[] args) {
        int a=1000;
        int b=3;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    //euclidean algorithm
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
        /*
        since
            a * b = hcf(gcd) * lcm
         */

    }
}
