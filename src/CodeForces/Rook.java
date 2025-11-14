package CodeForces;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            char c=s.charAt(0); int n=s.charAt(1)-'0';
            for(int i=1;i<=8;i++){
                if(i!=n)System.out.println(c+""+i);
            }
            for(int i=0;i<8;i++){
                if(i!=(c-'a'))System.out.println((char)('a'+i)+""+n);
            }
        }
    }
}
