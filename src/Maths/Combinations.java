package Maths;

public class Combinations {
    static long MOD = 998244353;
    static int N = (int)2e5 + 1;
    static long[] f=new long[N];
    public static void main(String[] args) {

    }
    public static void compute() {
        f[0]=1;
        f[1]=1;
        for (int i = 2; i < N; i++) {
            f[i] = f[i-1] * i;
        }
    }
    public static long C(int n, int r) {
        long ans = f[n];
        long den = (f[n-r]%MOD * f[r]%MOD) % MOD;
        ans = (ans%MOD * inv(den, MOD-2, MOD)%MOD) % MOD;
        return ans;
    }
    public static long inv(long n,long pow, long mod){
        if (pow == 1) return n;
        if (pow == 0) return 1;
        long temp=inv(n, pow/2, mod);
        temp = (temp%mod * temp%mod) % mod;
        if (n%2!=0) temp = (temp%mod * n%mod) % mod;
        return temp;
    }
}
