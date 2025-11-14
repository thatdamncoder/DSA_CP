package CodeForces;

import java.util.Scanner;

public class ClockandStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d= sc.nextInt();
            int g=get(a,b,c);
            int f=get(a,b,d);
            if(g!=f) System.out.println("YES");
            else System.out.println("NO");

        }
    }
    private static int get(int a,int b,int c){
        for (int i = a; i!=b ; i=(i+1)%13) {
            if(i==c) return 1;
        }
        return 2;
    }
}
