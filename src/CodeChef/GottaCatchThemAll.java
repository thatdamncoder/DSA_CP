package CodeChef;

import java.util.Scanner;

public class GottaCatchThemAll {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            long ans=0;
            for (int i = 0; i < n; i++) {
                if((arr[i]*a)<b) ans+= (long) arr[i]*a;
                else ans+=b;
            }
            System.out.println(ans);
        }
    }
}
