package CodeForces;

import java.util.Scanner;

public class TwoFriends {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int ans=3;
            for (int i = 0; i < n; i++) {
                int k=arr[i];
                if(arr[k-1]==i+1) {
                    ans=2;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
