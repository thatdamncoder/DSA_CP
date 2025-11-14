package CodeForces;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==b){
                System.out.println((c%2==0)?"Second":"First");
            }
            else{
                if(a>b){
                    System.out.println((c%2!=0)?"First":"Second");
                }else{
                    System.out.println((c%2==0)?"First":"Second");
                }
            }

        }
    }
}
