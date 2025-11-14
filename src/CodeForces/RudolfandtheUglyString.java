package CodeForces;

import java.util.Scanner;

public class RudolfandtheUglyString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            int i=0;
            while(i<n){
                String sub=(i+3<=n)?s.substring(i,i+3):"";
                if(sub.equals("map") || sub.equals("pie")){
                    count++;
                    i+=3;
                }
                else i++;
            }
            System.out.println(count);
        }
    }
}

