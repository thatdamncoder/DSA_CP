package CodeForces;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%k==0 || n%2==0 || (n%k)%2==0 || (n-k)%2==0) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
