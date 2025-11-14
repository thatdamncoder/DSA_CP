package CodeChef;

import java.util.Scanner;

public class LongestANDSubarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long nearest2=0;
            int save=n;
            long power=1;
            while(n!=0){
                if((n&1)==1) nearest2=power;
                power*=2;
                n>>=1;
            }
            long ans=Math.max(nearest2/2,save-nearest2+1);
            System.out.println(ans);
        }
    }
}
