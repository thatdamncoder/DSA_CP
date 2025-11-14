package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayFix2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            boolean sorted=true;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(i-1>=0 && arr[i-1]>arr[i]) sorted=false;
            }
            if(sorted){
                System.out.println("YES");
                continue;
            }
            int curr=0;
            boolean ok=true;
            for (int i = 0; i < n; i++) {
                if(curr>arr[i]) {
                    ok=false;
                    break;
                }
                else{
                    if(arr[i]%10==arr[i]){
                        curr=arr[i];
                    }
                    else{
                        if(curr<=arr[i]/10 && arr[i]/10<=arr[i]%10) curr=arr[i]%10;
                        else curr=arr[i];
                    }
                }
            }
            System.out.println(ok?"YES":"NO");
        }
    }

}
