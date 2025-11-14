package CodeChef;

import java.util.Scanner;

public class ManhattanXOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            long xor=((x-1)+(y-1))^((n-x)+(n-y));
            System.out.println(xor);
        }
    }
}
