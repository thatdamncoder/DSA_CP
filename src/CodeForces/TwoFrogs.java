package CodeForces;

import java.util.Scanner;

public class TwoFrogs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b){
                //a-1>0
                if((b-a-1)%2!=0) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                if((a-b-1)%2!=0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
