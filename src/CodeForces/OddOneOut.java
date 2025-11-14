package CodeForces;

import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int ans=sc.nextInt();
            ans=ans^ sc.nextInt();
            ans=ans^sc.nextInt();
            System.out.println(ans);
        }
    }
}
