package CodeForces;

import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int neg=Integer.MIN_VALUE;
            int pos=Integer.MAX_VALUE;
            boolean haszero=false;
            for (int i = 0; i < n;i++) {
                int a=sc.nextInt();
                if(a==0) haszero=true;
//                else if(a<0){
//                    neg=Math.max(neg,a);
//                }
//                else{
//                    pos=Math.min(pos,a);
//                }
                else pos=Math.min(pos,Math.abs(a));
            }
            if(haszero) System.out.println(0);
//            else System.out.println(Math.min(Math.abs(neg),Math.abs(pos)));
            else System.out.println(pos);
        }

    }
}
