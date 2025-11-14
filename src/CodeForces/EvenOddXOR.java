package CodeForces;

import java.util.Scanner;

public class EvenOddXOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                if(i==n-1) System.out.print(n%2==0?1:0 + " ");
                else System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
