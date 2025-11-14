package CodeForces;

import java.util.Scanner;
//question of spoj
public class AConjectureofPaulErdos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(!computed) seive();
        while(num--!=0){
            int n=sc.nextInt();
            long count=0;
            for (int i = 1; i*i <=n ; i++) {
                for (int j = 1; j*j*j*j <=n ; j++) {
                    int i1 = (i * i) + (j * j * j * j);
                    if(i1>10000000 || i1>n) continue;
                    if(!notprime[i1]) count++;
                }
            }
            System.out.println(count);
        }
    }
    static boolean[] notprime=new boolean[10000001];
    static boolean computed=false;
    private static void seive(){
        computed=true;
        notprime[0]=true;
        notprime[1]=true;
        int n=10000000;
        for (int i = 2; i*i <= n; i++) {
            if(!notprime[i]){
                for (int j = i*i; j <=n ; j+=i) {
                    notprime[j]=true;
                }
            }
        }
    }
}
