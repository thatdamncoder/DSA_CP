package CodeForces;

import java.util.Scanner;

public class ThornsandCoins {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            String s=sc.next();
            Integer[] t=new Integer[n];
            System.out.println(rec(0,s,t));
        }
    }
    public static int rec(int i,String s,Integer[] t){
        if(i>=s.length()) return 0;
        if(s.charAt(i)=='*') return 0;

        if(t[i]!=null) return t[i];
        int onestep=((s.charAt(i)=='@')?1:0) + rec(i+1,s,t);
        int twostep=((s.charAt(i)=='@')?1:0) +  rec(i + 2, s,t);

        return t[i]=Math.max(onestep,twostep);
    }
}
