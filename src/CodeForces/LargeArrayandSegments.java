package CodeForces;

import java.util.Scanner;

public class LargeArrayandSegments {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int t=sc.nextInt();
            long x=sc.nextLong();
            int[] arr=new int[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            long k=(long)Math.ceil(1.0*x/sum);
//            System.out.println(sum+" " +k);
            if(k>t) System.out.println(0);
            else{
                long total=sum*k;
                int count=0;
                for (int i = 0; i < n; i++) {
                    if(total>=x) count++;
                    total-=arr[i];
                }
//                long seg= (long) n*t-k+1;
//                long ans=seg*count;
//                System.out.println(count+" " + seg);
                long ans=n*(t-k) + count;
                System.out.println(ans);
            }
        }
    }
}
