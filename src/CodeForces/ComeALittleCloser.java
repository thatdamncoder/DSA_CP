package CodeForces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ComeALittleCloser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] x=new int[n];
            int[] y=new int[n];
            int[][] arr=new int[n][2];
            Map<Integer,Integer> xmap=new HashMap<>();
            Map<Integer,Integer> ymap=new HashMap<>();
            for (int i = 0; i < n; i++) {
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
                arr[i][0]=x[i];
                arr[i][1]=y[i];
                xmap.put(x[i], xmap.getOrDefault(x[i],0)+1);
                ymap.put(y[i], ymap.getOrDefault(y[i],0)+1);
            }
            Arrays.sort(x);
            Arrays.sort(y);
            long area=Long.MAX_VALUE;
            for (int i = 0; i < n && n>1; i++) {
                int xi=arr[i][0];
                int yi=arr[i][1];
                int minx=x[0];
                int maxx=x[n-1];
                int miny=y[0];
                int maxy=y[n-1];
                if(xi==x[0] && xmap.get(xi)==1) minx=x[1];
                else if(xi==x[n-1] && xmap.get(xi)==1) maxx=x[n-2];
                if(yi==y[0] && ymap.get(yi)==1) miny=y[1];
                else if(yi==y[n-1] && ymap.get(yi)==1) maxy=y[n-2];

                long a = (maxx -minx + 1L) * (maxy-miny+1L);
                if(a<n){
                    long m1=(maxx - minx + 1L + 1) * (maxy-miny+1L);
                    long m2=(maxx -minx + 1L) * (maxy-miny+1+1L);
//                    System.out.println(x[i] + " " + y[i] + " " +  m1+ " " + m2);
                    a=Math.min(m1,m2);
                }
//                System.out.println(i + " " +x[i] + " " + y[i] + " " +  a);
                area=Math.min(area,a);
            }
            if(n==1){
                area=1;
            }
            System.out.println(area);
        }

    }
}
