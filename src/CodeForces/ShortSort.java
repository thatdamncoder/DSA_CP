package CodeForces;

import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int f=0;
            for (int i = 0; i < 3; i++) {
                if(s.charAt(i)-'a'!=i) f++;
            }
            if(f<=2) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
