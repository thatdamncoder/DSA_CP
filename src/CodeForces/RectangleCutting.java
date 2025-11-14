package CodeForces;

import java.util.Scanner;

public class RectangleCutting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();


            boolean ok=true;
            if(a%2!=0 && b%2!=0){
                System.out.println("NO");
                ok=false;
            }
            else if(a%2==0 && b%2==0){
                if((2*b==a/2) && (2*a==b/2)){
                    System.out.println("NO");
                    ok=false;
                }
            }
            else if(a%2==0){
                if(b==(a/2)) {
                    System.out.println("NO");
                    ok=false;
                }
            }
            else{
                if(a==b/2) {
                    System.out.println("NO");
                    ok=false;
                }
            }
            if(ok)System.out.println("YES");
        }
    }
}
