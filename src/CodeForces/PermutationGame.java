package CodeForces;

import java.util.Scanner;

public class PermutationGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            int b=sc.nextInt();
            int s=sc.nextInt();
            b--;
            s--;
            int[] p=new int[n];
            for (int i = 0; i < n; i++) {
                p[i]=sc.nextInt();
            }
            long[] arr=new long[n];
            long max=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                max=Math.max(max,arr[i]);
            }
            long bo=0;
            long sa=0;
            long k1=k;
            long k2=k;
            while(k1>0) {
                if (arr[b] == max) {
                    bo += (k1) * max;
                    k1 = 0;
                } else if (k1 > 0 && arr[p[b] - 1] > arr[b]) {
                    bo += arr[b];
                    b = p[b] - 1;
                    k1--;
                } else if (k1 > 0) {
                    bo += arr[b];
                    k1--;
                }
                else break;
            }
            while(k2>0) {
                if(arr[s]==max){
                    sa+=(k2)*max;
                    k2=0;
                }
                else if(k2>0 && arr[p[s]-1]>arr[s]){
                    sa+=arr[s];
                    s=p[s]-1;
                    k2--;
                }
                else if(k2>0) {
                    sa+=arr[s];
                    k2--;
                }
                else break;
            }

            if(bo>sa) System.out.println("Bodya");
            else if(sa>bo) System.out.println("Sasha");
            else System.out.println("Draw");
        }
    }
}
