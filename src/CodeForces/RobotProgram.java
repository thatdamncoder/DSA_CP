package CodeForces;

import java.util.Scanner;

public class RobotProgram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            long k=sc.nextLong();
            String s=sc.next();
            long ans=0;
            int[] forzero=getData(0,s);
            int[] forstart=getData(x,s);

            if(forstart[0]!=0 && k>=forstart[1]){
                k-=forstart[1];
                ans++;
                if(k>0){
                    if(forzero[0]!=0){
                        ans+=(k/forzero[1]);
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public static int[] getData(int start,String s){
        //[ifzero,moves]
        for(int i=0;i<s.length();i++){
            start+=(s.charAt(i)=='L'?-1:1);
            if(start==0){
                return new int[]{1,i+1};
            }
        }
        return new int[]{0,s.length()};
    }
}
