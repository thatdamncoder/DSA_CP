package CodeForces;

import java.util.Scanner;

public class DarkMatter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int a=sc.nextInt();
            sc.next();
            int b=sc.nextInt();
            long ans=a+b+1;
            System.out.println(ans);
        }
    }
}
