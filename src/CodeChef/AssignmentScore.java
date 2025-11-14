package CodeChef;

import java.util.Scanner;

public class AssignmentScore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long sum=0;
            long total=(n+1)*100L;
            total/=2;
            for (int i = 0; i < n; i++) {
                sum+=sc.nextLong();
            }
            long ans=Math.max(0,total-sum);
            System.out.println(ans>100?-1:ans);
        }
    }
}
