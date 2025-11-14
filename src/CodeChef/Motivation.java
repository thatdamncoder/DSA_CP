package CodeChef;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int max=0;
            for (int i = 0; i < n; i++) {
                int sp=sc.nextInt();
                int imdb=sc.nextInt();
                if(sp<=s){
                    max=Math.max(max,imdb);
                }
            }
            System.out.println(max);
        }
    }
}
