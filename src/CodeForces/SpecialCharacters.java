package CodeForces;

import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            if(n%2!=0){
                System.out.println("NO");
                continue;
            }
            StringBuilder sb=new StringBuilder();
            int t=0;
            for (int i = 0; i < n; i+=2) {
                char ch=(char)('A'+t);
                sb.append(ch);
                sb.append(ch);
                t++;
            }
            System.out.println("YES");
            System.out.println(sb);
        }
    }
}
