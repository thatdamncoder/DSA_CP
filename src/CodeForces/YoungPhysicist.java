package CodeForces;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int a=0;
            int b=0;
            int c=0;
            for (int i = 0; i < n; i++) {
                a+=sc.nextInt();
                b+=sc.nextInt();
                c+=sc.nextInt();
            }
            System.out.println((a==0 && b==0 && c==0)?"YES":"NO");
        }

    }
}
