package CodeChef;

import java.util.Scanner;

public class AlternatingBinaryString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            for (int i = 1; i < n; i++) {
                if(s.charAt(i)==s.charAt(i-1)) count++;
            }
            System.out.println(count);
        }
    }
}
