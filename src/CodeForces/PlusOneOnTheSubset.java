package CodeForces;

import java.util.Scanner;

public class PlusOneOnTheSubset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                min=Math.min(min,a);
                max=Math.max(max,a);
            }
            System.out.println(max-min);
        }
    }
}
