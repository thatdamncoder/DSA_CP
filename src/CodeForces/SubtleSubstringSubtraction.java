package CodeForces;

import java.util.Scanner;

public class SubtleSubstringSubtraction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int n=s.length();
            if(n==1) {
                System.out.println("Bob" + " " + ((s.charAt(0)-'a')+1));
                continue;
            }
            int sum=0;
            int start=0;
            int seclast=0;
            for(int i=0;i<n;i++){
                int calc=(s.charAt(i)-'a')+1;
                sum+=calc;
                if(i==0) start=sum;
                if(i==n-2) seclast=sum;
            }
            if(n%2==0) System.out.println("Alice" + " " + sum);
            else{
                int max=Math.max(seclast,sum-start);
                int rem=sum-max;
                System.out.println("Alice" + " " + (max-rem));
            }

        }
    }
}
