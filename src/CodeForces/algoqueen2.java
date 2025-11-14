package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class algoqueen2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            double h=sc.nextDouble();
            double w=sc.nextDouble();
            double[][] coor=new double[n][3];
            for (int i = 0; i <n; i++) {
                coor[i][0]=sc.nextDouble();
                coor[i][1]=sc.nextDouble();
                coor[i][2]=sc.nextDouble();
            }
            Arrays.sort(coor, (a,b) -> Double.compare(a[1],b[1]));
            boolean ok=false;
            double ele=-1;
            double count=0;
            double itr=-1;
            for (int i = 0; i < n; i++) {
                double curry=coor[i][1];
                if(ele!=curry){
                    itr++;
                    if(ok) break;
                    ele=curry;
                    count=1;
                } else count++;
                if(itr==0){
                    ok=((coor[i][1]-coor[i][2])>0);
                }
                for (int j = i-1; j >=0 && itr>0; j--) {
                    double prevy=coor[j][1];
                    if(prevy<curry){
                        ok=check(coor[i][0],coor[i][1],coor[j][0],coor[j][1],coor[i][2],coor[j][2]);
                    }
                }
            }
            System.out.println(ok?"YES":"NO");
        }

    }
    public static boolean check(double x,double y,double tx,double ty,double ra,double r){
        double distance=Math.sqrt((tx-x)*(tx-x) + (ty-y)*(ty-y));
        double rdist = ra+r;
        return distance<=rdist;
    }
}
