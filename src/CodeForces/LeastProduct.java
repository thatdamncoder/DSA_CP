package CodeForces;

import java.util.Scanner;

public class LeastProduct {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int hasNeg=1;
            boolean hasZero=false;
            for (int i = 0; i < n; i++) {
                int ele=sc.nextInt();
                if(ele<0) hasNeg*=-1;
                if(ele==0) hasZero=true;
            }
            if(hasZero || hasNeg==-1) System.out.println(0);
            else {
                System.out.println(1);
                System.out.println(1 + " " + 0);
            }
        }
    }
}
