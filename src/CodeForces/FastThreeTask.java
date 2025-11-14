package CodeForces;

import java.util.Scanner;

public class FastThreeTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            long sum=0L;
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                sum+=Math.abs(arr[i]);
            }
            int ans=0;
            if(sum%3==0) System.out.println(0);
            else if(sum%3==2) System.out.println(1);
            else{
                for (int i = 0; i < n; i++) {
                    if((sum-arr[i])%3==0){
                        ans=1;
                        break;
                    }
                }
                System.out.println((ans==1)?ans:2);
            }
        }
    }
}
