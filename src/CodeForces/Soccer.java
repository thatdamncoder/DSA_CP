package CodeForces;

import java.util.Scanner;

public class Soccer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if ((a>b && c>d) || (a<b && c<d)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
