package CodeForces;

import java.util.Scanner;

public class PaintingtheRibbon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int colors=sc.nextInt();
            int k=sc.nextInt();
//            if(colors==1){
//                System.out.println("NO");
//                continue;
//            }
            int compl=n/colors;
            int rem=Math.min(1,n%colors);
            if(n-compl-rem<=k) System.out.println("NO");
            else System.out.println("YES");

        }
    }

}
