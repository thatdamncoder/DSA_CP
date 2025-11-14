package CodeForces;

import java.util.Scanner;

public class MainiakandInterestingSequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int sum=sc.nextInt();
            if((n%2==0 && sum%2!=0) || (n>sum) ) System.out.println("NO");
            else{
                System.out.println("YES");
                int start=(n-1)%2!=0?2:1;
                int replace=(sum-(n-start))/start;
                for (int i = 0; i < start; i++) {
                    System.out.print(replace + " ");
                }
                for (int i = start; i < n; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }
    }
}
