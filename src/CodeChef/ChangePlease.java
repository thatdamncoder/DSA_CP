package CodeChef;

import java.util.Scanner;

public class ChangePlease {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int c=(100-n);
            int ans=c-(c%10);
            System.out.println(ans);
        }
    }
}
