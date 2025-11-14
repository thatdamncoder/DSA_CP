package CodeChef;

import java.util.Scanner;

public class InvertAndEqualise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            long ones=0;
            long c=0;
            long zeros=0;
            int d=0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='1') {
                    zeros+=Math.min(1,d);
                    d=0;
                    c++;
                }
                else{
                    ones+=Math.min(1,c);
                    c=0;
                    d++;
                }
            }
            zeros+=Math.min(1,d);
            ones+=Math.min(1,c);
            System.out.println(Math.min(ones,zeros));
        }
    }
}
