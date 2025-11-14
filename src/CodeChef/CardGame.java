package CodeChef;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int c=0;
            for(int i=1;i<=n;i++){
                if(i==x) continue;
                if((x+i)%2==0) c++;
            }
            System.out.println(c);
        }
    }
}
