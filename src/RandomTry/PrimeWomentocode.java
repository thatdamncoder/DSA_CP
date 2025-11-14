package RandomTry;

import java.util.Scanner;

public class PrimeWomentocode {
    public static void main(String[] args){
        int N= 1000000;
        boolean[] t=new boolean[N+1];
        t[0]=true;
        t[1]=true;
        for(int i=2;i*i<=N;i++) {
            if (!t[i]) {
                for (int j = i * i; j <=N; j = j + i) {
                    t[j] = true;
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
//        int f=Integer.MAX_VALUE;
//        int s=Integer.MIN_VALUE;
        int f=n-1;
        int s=n-1;
        boolean foundf=false;
        boolean founds=false;
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            if(i==j) break;
            if(!foundf && !t[arr[i]]){
//                System.out.println(i);
                f= i;
                foundf = true;
            }
            if(!founds && !t[arr[j]]){
//                System.out.println(i);
                s= j;
                founds = true;
            }
        }
//        System.out.println(s + " " +f);
        if(!foundf && !founds) {
            System.out.println(-1);
        }
//        else if(!(foundf && founds)){
//            System.out.println(0);
//        }
        else {
            System.out.println(s-f);
        }
    }
}
