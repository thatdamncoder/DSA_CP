package CodeForces;

import java.util.Scanner;

public class algoqueen1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            double r = sc.nextDouble();
            for (int i = 0; i < n; i++) {
                double ra = sc.nextDouble();
                double x=sc.nextDouble();
                double y=sc.nextDouble();
                double tx=sc.nextDouble();
                double ty=sc.nextDouble();

                double distance=Math.sqrt((tx-x)*(tx-x) + (ty-y)*(ty-y));
                double rdist = ra+r;
                if(distance<=rdist){
                    System.out.println("True");
                } else System.out.println("False");
            }
        }
    }
}
