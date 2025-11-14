package CodeForces;

import java.util.Scanner;

public class LatinSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int count=0;
            char ans=' ';
            for(int i=0;i<3;i++) {
                String s = sc.next();
                for (int j = 0; j < 3; j++) {
                    if (s.charAt(j) != '?') count += (s.charAt(j) - 'A')+1;
                }
                if (count == 6) count = 0;
                else {
                    ans=(char) ('A'+ 5-count);
                    count=0;
                }
            }
            System.out.println(ans);
        }
    }
}
