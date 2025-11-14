package CodeForces;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int[] arr=new int[n];
            long sum=0;
            int mod=(int)1e9 + 7;
            long max=0;
            int maxindex=-1;
            int startindex=0;
            int changeindex=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                sum+=arr[i]%mod;
                if(sum>=max){
                    max=sum;
                    maxindex=i;
                    startindex=changeindex;
                }
                if(sum<0){
                    sum=0;
                    changeindex=i;
                }
            }
            long remsum=0;
//            System.out.println(startindex + " " + maxindex);
            for (int i = 0; i < n; i++) {
                if(max!=0 && i>=startindex && i<=maxindex) continue;
                remsum=(remsum%mod + arr[i]%mod)%mod;
            }
//            System.out.println((max*(k)*2) + " " + remsum);
            long finalsum=Math.max(0,max)*((int) Math.pow(2,k)) + remsum;
            System.out.println((finalsum+mod)%mod);

        }
    }
}
/*
999999996
96
896
17
351
716455332
42
2
0
897909241
0
416571966

 */