package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class FlowerCityFence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            if(arr[0]!=n){
                System.out.println("NO");
                continue;
            }
            int[] ans=new int[n];
            for (int i = 0; i<n; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    ans[j]+=1;
                }
            }
            if(Arrays.equals(arr,ans)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
