package CodeChef;

import java.util.Scanner;

public class PepBidding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long suma=0;
            long sumb=0;
            long defa=0;
            long defb=0;
            for (int i = 0; i < n; i++) suma+=sc.nextInt();
            for (int i = 0; i < n; i++) defa+=sc.nextInt();
            for (int i = 0; i < n; i++) sumb+=sc.nextInt();
            for (int i = 0; i < n; i++) defb+=sc.nextInt();
            if(suma>sumb && defa>defb) System.out.println("A");
            else if(suma<sumb && defa<defb) System.out.println("B");
            else System.out.println("DRAW");
        }
    }
}

