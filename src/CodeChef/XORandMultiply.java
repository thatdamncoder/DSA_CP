package CodeChef;

import java.util.Scanner;

public class XORandMultiply {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=0;
            for (int i = 0; i < 31; i++) {
                if((1<<i)>=(1<<(n))) break;
                int a1=(a)&(1<<i);
                int b1=(b)&(1<<i);
                if(a1==b1 && a1==0){
                    ans|=(1<<i);
                }
            }
            System.out.println(ans);
        }
    }
}
