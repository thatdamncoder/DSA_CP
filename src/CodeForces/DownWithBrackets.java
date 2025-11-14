package CodeForces;

import java.util.Scanner;

public class DownWithBrackets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int count=0;
            boolean ok=false;
            for (int i = 0; i < s.length(); i++) {
                char ch=s.charAt(i);
                if(i!=0 && count==0){
                    ok=true;
                    break;
                }
                if(ch=='(') count++;
                else count--;
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
