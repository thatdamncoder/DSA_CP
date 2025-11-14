package CodeForces;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GareebosFibonacci {
    static long mod=1000000007;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Long> list=new ArrayList<>();
        for(int i=0;i<=3;i++) list.add((long)i);
        long num=sc.nextInt();
        while(num--!=0){
            long n=sc.nextLong();
            if(n<list.size()) System.out.println(list.get((int)n)%mod);
            else{
                for (int i = list.size(); i <=n ; i++) {
                    long ans=((list.get(i-1)%mod)+(list.get(i-2)%mod)+(list.get(i-3)%mod+4))%mod;
                    if(i%2!=0) ans++;
                    list.add(ans%mod);
                }
                System.out.println(list.get((int)n)%mod);
            }
        }
    }
    static long bottomup(long n){
        if(n<=3) return n;
        long[] t=new long[(int)n+1];
        for(int i=0;i<=3;i++) t[i]=(long)i;
        for(int i=4;i<=n;i++){
            t[i]=((t[i-1]%mod)+(t[i-2]%mod)+(t[i-3]%mod))%mod;
            if(i%2==0) t[i]+=4;
            else t[i]+=5;
        }
        return t[(int)n]%mod;
    }
    static long recurse(int n,long[] t){
        if(n<=3) return n;
        if(t[n]!=(long)0) return t[n];
        long ans=recurse(n-1,t)+recurse(n-2,t)+recurse(n-3,t)+4;
        if(n%2!=0) ans++;
        return t[n]=ans;
    }
}
