package CodeForces;

import java.util.Scanner;

public class TrickyTemplate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            boolean ans=false;
            for (int i = 0; i < n; i++) {
                char as=a.charAt(i);
                char bs=b.charAt(i);
                char cs=c.charAt(i);
                if(as==bs && as!=cs) {
                    ans = true;
                }
                if(as!=bs && as!=cs && bs!=cs){
                    ans=true;
                }
            }
            System.out.println(!ans?"NO":"YES");
        }
    }

}
