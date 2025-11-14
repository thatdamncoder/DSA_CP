package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SatisfyingConstraints {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long max=Integer.MIN_VALUE;
            long min=Integer.MAX_VALUE;
            List<Long> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                long a=sc.nextInt();
                long b=sc.nextInt();
                if(a==1) max= Math.max(max,b);
                else if(a==2) min=Math.min(min,b);
                else if(a==3) list.add(b);
            }
            long ans=min-max+1;
            for(long i:list){
                if(i>=max && i<=min) ans--;
            }
            System.out.println(Math.max(ans, 0));
        }
    }
}
