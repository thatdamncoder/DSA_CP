package AOALab;

public class powerRec {
    public static void main(String[] args) {
        int x=3;
        int n=9;
        System.out.println(rec(x,n));
        System.out.println(expo(x,n));
    }
    public static long rec(int x,int n){
        if(n==0) return 1L;
        return x*rec(x,n-1);
    }
    public static long expo(int x,int n){
        if(n==0) return 1L;
        if(n==1) return x;
        long temp=expo(x,n/2);
        temp*=temp;
        temp*=(n&1)==0?1:x;
        return temp;
    }

}
