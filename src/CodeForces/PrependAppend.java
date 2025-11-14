package CodeForces;

import java.util.Scanner;

public class PrependAppend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int i=0;
            int j=n-1;
            while(i<j){
                char ci=s.charAt(i);
                char cj=s.charAt(j);
                if((ci=='0' && cj=='1') || (ci=='1' && cj=='0')){
                    i++;
                    j--;
                }
                else break;
            }
            if(i>j) System.out.println(0);
            else System.out.println(j-i+1);
        }
    }
}
