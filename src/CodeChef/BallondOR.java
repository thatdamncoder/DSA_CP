package CodeChef;

import java.util.Scanner;

public class BallondOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long prod=1;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                prod*=a;
            }
            if(prod==1 || (prod>=256 && prod%256==0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
