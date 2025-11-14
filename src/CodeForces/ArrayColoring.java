package CodeForces;

import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=sc.nextInt();
            }
            System.out.println(sum%2==0?"YES":"NO");
        }
    }
}
