package CodeForces;

import java.util.Scanner;

public class WoodPolishing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            int x = sc.nextInt();
            int y= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Long[][] t=new Long[n+1][2];
            System.out.println(rec(n,x,y,0,arr,t));
        }
    }
    public static long rec(int i,int x, int y, int broken,int[] arr,Long[][] t){
        if(i==1) return arr[0] + ( broken==1?y:0);

        if(t[i][broken]!=null) return t[i][broken];

        long dontbreak = arr[i-1];
        long dobreak = Integer.MAX_VALUE;
        for (int j = 1; j <=(i/2) ; j++) {
            long first = rec(j,x,y,1,arr,t);
            long second = rec(i-j,x,y,1,arr,t);
            long total=Integer.MAX_VALUE;
            if(first!=Integer.MAX_VALUE && second!=Integer.MAX_VALUE) total=first+second;
            dobreak=Math.min(total,dobreak);
        }
        return t[i][broken]=Math.min(dontbreak,dobreak);
    }
}
