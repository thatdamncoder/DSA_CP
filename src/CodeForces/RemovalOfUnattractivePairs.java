package CodeForces;

import java.util.Scanner;

public class RemovalOfUnattractivePairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s= sc.next();
            StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)!=sb.charAt(i+1)){
//                    int save=i+1;
//                    if(i-1>=0) save=i-1;
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i+1);
                }
            }
            System.out.println(sb.length());
        }
    }
}
