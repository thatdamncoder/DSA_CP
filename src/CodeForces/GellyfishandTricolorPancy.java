package CodeForces;

import java.util.Scanner;

public class GellyfishandTricolorPancy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int g=sc.nextInt();
            int f=sc.nextInt();
            int gk=sc.nextInt();
            int fk=sc.nextInt();

            int fmin=Math.min(f,fk);
            int x=fmin+fmin-1;
            int y=x/2;
            int gmin=Math.min(g,gk);
            if(gmin<=y){
                System.out.println("Flower");
            } else{
                System.out.println("Gellyfish");
            }


        }
    }
}
