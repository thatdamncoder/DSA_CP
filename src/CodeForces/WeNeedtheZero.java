package CodeForces;

import java.util.Scanner;

public class WeNeedtheZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int xor=0;
            for (int i = 0; i < n; i++) {
                xor^=sc.nextInt();
            }
            if(n%2!=0) System.out.println(xor);
            else{
                if(xor==0) System.out.println(1);
                else System.out.println(-1);
            }
        }
    }
}
