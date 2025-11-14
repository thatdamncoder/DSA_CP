package CodeForces;

import java.util.Scanner;

public class AdjacentDigitSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            boolean ok=false;

            if(x<y && y-x==1) ok=true;
            else if(x>y && (x-y+1)%9==0) ok=true;
            System.out.println(ok?"YES":"NO");

        }
    }
}
