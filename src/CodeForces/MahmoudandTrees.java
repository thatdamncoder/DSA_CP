package CodeForces;

import java.util.Scanner;

public class MahmoudandTrees {
    public static void main(String[] args){
        //try1
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n= sc.nextInt();
            for (int i = 0; i < n-1; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
            }
            long sum=0;
            for (int i = 4; i <=n ; i+=2) {
                sum+=(n-i+1);
            }
            System.out.println(sum);
        }
    }
}
