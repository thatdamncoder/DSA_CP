package CodeForces;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            boolean found=false;
            int count=0;
            for (int i = 0; i < n; i++) {
                if((i+2<n) && s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.'){
                    found=true;
                    break;
                }
                else if(s.charAt(i)=='.') count++;
            }
            System.out.println(found?2:count);
        }
    }
}
