package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TRYING- TLE EXPECTED
public class BeautifulSequence {
    static long MOD = 998244353;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-- != 0){
            //TRYING TLE EXPECTED
            int n = sc.nextInt();
            List<Integer> ones = new ArrayList<>();
            List<Integer> threes = new ArrayList<>();
            int[] twos = new int[n+1];

            for (int i = 0; i < n; i++) {
                int c = sc.nextInt();
                twos[i+1] = twos[i];

                if(c == 1) ones.add(i);
                else if(c == 2) twos[i+1]++;
                else if(!ones.isEmpty()) threes.add(i);
            }
            long ans = 0;
            for (int o : ones) {
                for (int t: threes){
                    if(t < o) continue;
                    int bet = twos[t+1] - twos[o+1];
                    ans = (ans%MOD + (binaryexp(2,bet)%MOD-1)%MOD)%MOD;
                }
            }
            System.out.println(ans);
        }
    }
    public static long binaryexp(int n,int p){
        if(p==1) return n;
        if(p==0) return 1;

        long temp = binaryexp(n,p/2);
        temp = (temp%MOD * temp%MOD)%MOD;
        if(p%2!=0) temp=(temp%MOD * n%MOD)%MOD;
        return temp%MOD;
    }
}
