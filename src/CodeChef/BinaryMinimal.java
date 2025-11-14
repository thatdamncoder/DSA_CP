package CodeChef;

import java.util.Scanner;

public class BinaryMinimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if(k==0) {
                System.out.println(s);
                continue;
            }
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<n && k>0) {
                if (s.charAt(i) == '1') k--;
                else {
                    sb.append('0');
                }
                i++;
            }
            if(k<=0) System.out.println(sb);
            else{
                System.out.println(sb.substring(0,sb.length()-k));
            }
        }
    }
}
