package CodeForces;

import java.util.Scanner;

public class HowMuchDaytonaCost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int target=sc.nextInt();
            boolean found=false;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if(a==target) found=true;
            }
            System.out.println(found?"YES":"NO");
        }
    }
}
