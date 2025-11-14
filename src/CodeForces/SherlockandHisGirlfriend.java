package CodeForces;

import java.util.Scanner;

public class SherlockandHisGirlfriend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        if(!computed) seive();
        while(num--!=0){
            int n=sc.nextInt();

            if(n==1) {
                System.out.println(1);
                System.out.println(1);
            }
            else if(n==2) {
                System.out.println(1);
                System.out.println(1 + " " + 1);
            }
            else {
                System.out.println(2);
                for (int i = 2; i <= n+1; i++) {
                    if (notprime[i]) System.out.print(2 + " ");
                    else System.out.print(1 + " ");
                }
                System.out.println();
            }
        }
    }
    static boolean[] notprime=new boolean[100003];
    static boolean computed=false;
    private static void seive(){
        computed=true;
        notprime[0]=true;
        notprime[1]=true;
        int n=100002;
        for (int i = 2; i*i<=n ; i++) {
            if(!notprime[i]){
                for(int j=i*i;j<=n;j+=i){
                    notprime[j]=true;
                }
            }
        }
    }
}
