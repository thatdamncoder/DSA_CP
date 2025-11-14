package CodeChef;

import java.util.Scanner;

public class LegsOnAFarm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            if(n==2 || n==4) System.out.println(1);
            else{
                int cows=n/4;
                int chick=(n%4)/2;
                System.out.println(cows+chick);
            }
        }
    }
}
