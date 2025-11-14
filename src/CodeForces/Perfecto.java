package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Perfecto {
    static Set<Long> set =new HashSet<>();
    static boolean computed=false;
    public static void main(String[] args){
        if(!computed) compute();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];

            long sum=0;
            int curr=n;
            int next=n-1;
            for(int i=2;i<=n;i++){
//                System.out.println(sum+" "+curr+" "+next);
                if (set.contains(sum+curr)) {
                    sum+=next;
                    next=n-i;
                }else{
                    sum+=curr;
                    curr=next;
                    next=n-i;
                }
                arr[i-2]=sum;
            }
            sum+=curr;
            arr[n-1]=sum;
            boolean ok=true;
            for (int i = 0; i < n; i++) {
                if(set.contains(arr[i])){
                    ok=false;
                    break;
                }
            }
            if(n==1 || !ok) System.out.println(-1);
            else{
                System.out.print(arr[0]+ " ");
                for (int i = 1; i < n; i++) {
                    System.out.print((arr[i]-arr[i-1])+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void compute(){
        computed=true;
        for (long i = 1; i * i <= (long) 1e10; i++) {
            set.add(i*i);
        }
    }
}
