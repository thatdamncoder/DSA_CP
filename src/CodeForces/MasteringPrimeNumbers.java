package CodeForces;

import java.util.Scanner;

public class MasteringPrimeNumbers {

    public static void main(String[] args) {
        int n= 1000000;
        boolean[] t=new boolean[n+1];
        t[0]=true;
        t[1]=true;
        for(int i=2;i*i<=n;i++) {
            if (!t[i]) {
                for (int j = i * i; j <=n; j = j + i) {
                    t[j] = true;
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int max=0;
            int count=0;
            for (int i = l+1; i<r ; i++) {
                if(!t[i]){ //false - isprime
                    max=Math.max(max,count);
                    count=0;
                }
                else count++;
            }
            max=Math.max(max,count);
            System.out.println(max);
        }

    }
}
