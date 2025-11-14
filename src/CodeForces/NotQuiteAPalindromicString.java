package CodeForces;

import java.util.Scanner;

public class NotQuiteAPalindromicString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int o=0;
            for(char ch:s.toCharArray()) {
                o+=(ch-'0');
            }
            int z=n-o;
            int max=Math.max(o,z);
            int min=Math.min(o,z);
            int maxpairs=max/2;
            int minpairs=min/2;
            if((maxpairs+minpairs)<k) System.out.println("NO");
            else{
                int diff=max-min;
                diff+=(diff%2!=0?1:0);
                if((diff/2)>k) System.out.println("NO");
                else{
                    k-=(diff/2);
                    if(k%2==0) System.out.println("YES");
                    else System.out.println("NO");
                }

            }


        }
    }
}
