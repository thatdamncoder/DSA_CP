package CodeChef;

import java.util.Scanner;

public class MorningRun {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int peri=2*(a+b);
            System.out.println(peri>=1000?"YES":"NO");
        }
    }
}
