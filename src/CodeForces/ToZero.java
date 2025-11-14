package CodeForces;

import java.util.Scanner;

public class ToZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int count=0;
            if(n%2!=0){
                n-=k;
                count++;
            }
            while(n>=k){
                count+=n/(k-1);
                n=n%(k-1);
            }
            if(n!=0) count++;
            System.out.println(count);
        }
    }
}
