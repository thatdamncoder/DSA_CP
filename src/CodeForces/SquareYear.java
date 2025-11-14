package CodeForces;

import java.util.Scanner;

public class SquareYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int sum=Integer.parseInt(s);
            int sq=(int)Math.sqrt(sum);
            if(sq*sq==sum){
                System.out.println((sq/2) + " " + (sq-(sq/2)));
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
