package CodeForces;

import java.util.Scanner;

public class SashaAndTheDrawing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            k=(int)Math.ceil(k/2.0);
            if(k<=n) System.out.println(k);
            else System.out.println(k+1);

        }
    }
}
