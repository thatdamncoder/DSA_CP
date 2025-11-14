package CodeForces;

import java.util.Scanner;
public class RatingIncrease {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0) {
            String s = sc.next();
            if (s.length() == 2) {
                System.out.println((s.charAt(0) < s.charAt(1)) ? s.charAt(0) + " " + s.charAt(1) :-1);
                continue;
            }
            int ans = 0;
            for (int i = 1; i < s.length()/2; ) {
                if (s.charAt(i) == '0') i++;
                else {
                    ans = i;
                    break;
                }
            }
            System.out.println(
                    (((s.substring(0, ans).compareTo(s.substring(ans)) < 0)
                            || ((ans) < (s.length() - ans))) ?
                   (s.substring(0, ans) + " " + s.substring(ans)) : -1)
            );

        }
    }
}
