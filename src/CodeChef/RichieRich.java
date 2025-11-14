package CodeChef;

import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            System.out.println((b-a)/x);
        }
    }
}
