package CodeForces;

import java.util.Scanner;

public class VladandSumofSumofDigits {
    static int[] t=new int[200001];
    static boolean computed=false;
    public static void main(String[] args){
        if(!computed) compute();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            System.out.println(t[n]);
        }
    }
    private static void compute(){
        for (int i = 1; i <200001; i++) {
            t[i]=sum(i)+t[i-1];
        }
        computed=true;
    }
    private static int sum(int i){
        int ans=0;
        int n=i;
        while(n!=0){
            ans+=(n%10);
            n/=10;
        }
        return ans;
    }
}
