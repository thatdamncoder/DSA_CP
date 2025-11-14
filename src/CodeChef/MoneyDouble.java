package CodeChef;

import java.util.Scanner;

public class MoneyDouble {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long x=sc.nextLong();
            int y=sc.nextInt();
            for (int i = 0; i < y; i++) {
                if(x*2<1000) x+=1000;
                else x*=2;
            }
            System.out.println(x);

        }
    }
}
