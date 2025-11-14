package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NenesMagicalMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int sum=0;
            String finalstring="";
            for(int i=1;i<=n;i++) {
                sum+=i*(2*i-1);
                finalstring+=i+ " ";
            }
            System.out.println(sum + " " + (2*n));
            for (int i = n; i >=1; i--) {
                System.out.println(1 + " " + i + " " + finalstring);
                System.out.println(2 + " " + i + " " + finalstring);
            }
        }
    }
}
