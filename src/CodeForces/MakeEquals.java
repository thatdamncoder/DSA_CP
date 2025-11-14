package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeEquals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int avg=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                avg+=arr[i];
            }
            if(n==1){
                System.out.println("YES");
                continue;
            }
            if(avg%n!=0){
                System.out.println("NO");
                continue;
            }
            avg=avg/n;
            boolean ok=true;
            for (int i = 0; i < n; i++) {
                if(arr[i]>avg){
                    if(i==n-1){
                        ok=false;
                        break;
                    }
                    arr[i+1]+=arr[i]-avg;
                }
                else if(arr[i]<avg){
                    ok=false;
                    break;
                }
            }
            System.out.println((ok)?"YES":"NO");
        }
    }

}
