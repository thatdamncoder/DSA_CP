package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VamyaandCubes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            //bruteforce
            int n=sc.nextInt();
            int sum=0;
            int count=0;
            for (int i = 1; ; i++) {
                if(n>=sum) {
                    n -= sum;
                    sum += i;
                    count++;
                } else break;
            }
            System.out.println(Math.max(0,count-1));
        }
    }
}
