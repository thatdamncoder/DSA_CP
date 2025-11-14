package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            List<Integer> d=new ArrayList<>();
            List<Character> c=new ArrayList<>();
            boolean ok=true;
            for(int i=0;i<n && ok;i++){
                char ch=s.charAt(i);
                if(Character.isDigit(ch)) d.add(ch-'0');
                else {
                    if (i + 1 < n) {
                        char next = s.charAt(i + 1);
                        if (Character.isDigit(next)) ok = false;
                    }
                    c.add(ch);
                }
            }
            if(!ok){
                System.out.println("NO");
            }
            else{
                for (int i = 1; i < d.size() && ok; i++) {
                    if(d.get(i)<d.get(i-1)) ok=false;
                }
                for (int i = 1; i < c.size() && ok; i++) {
                    if(c.get(i)-'a'<c.get(i-1)-'a') ok=false;
                }
                System.out.println(ok?"YES":"NO");
            }

        }
    }

}
