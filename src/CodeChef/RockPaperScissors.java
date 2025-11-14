package CodeChef;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            char[] arr=s.toCharArray();
            long count=1;
            for (int i = 1; i < n; i++) {
                if(arr[i]!=arr[i-1]) count++;
                else arr[i]='$';
            }
            System.out.println(count);
        }
    }
}
