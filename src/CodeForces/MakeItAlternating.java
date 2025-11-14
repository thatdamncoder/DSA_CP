package CodeForces;

import java.util.Scanner;

public class MakeItAlternating {
    static long MOD = 998244353;
    static int N = (int)2e5 + 1;
    static long[] f=new long[N];

    static boolean computed = false;
    public static void main(String[] args){
        if (!computed) compute();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num--!=0){
            String s = sc.next();
            long modi = 0;
            long ways = 1;
            long count = 0;
            char ele = '$';
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ele){
                    modi += Math.max(count-1, 0);
                    if(count > 0) ways = (ways%MOD * count%MOD) % MOD;
                    ele = s.charAt(i);
                    count = 0;
                }
                count++;
            }
            modi += Math.max(count-1, 0);
            if(count > 0) ways = (ways%MOD * count%MOD) % MOD;
            ways = (ways%MOD * f[(int)modi]%MOD) % MOD;
            System.out.println(modi + " " + ways);
        }
    }
    public static void compute() {
        computed = true;
        f[0]=1;
        f[1]=1;
        for (int i = 2; i < N; i++) {
            f[i] = (f[i-1]%MOD * i%MOD)%MOD;
        }
    }
}
