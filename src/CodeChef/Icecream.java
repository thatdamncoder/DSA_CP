package CodeChef;

import java.util.Scanner;

public class Icecream {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(2*n>=k?"YES":"NO");
        }
    }
}
