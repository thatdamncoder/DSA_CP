package CodeForces;

import java.util.Scanner;

public class BoringDay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int[] arr=new int[n];
            int end=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]<=r) end++;
            }
            if(end==0) System.out.println(0);
            else{
                int start=1;
                end=n;
                int ans=0;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    boolean canWin=solve(l,r,mid,arr);
                    if(canWin){
                        ans=mid;
                        start=mid+1;
                    }
                    else end=mid-1;
                }
                System.out.println(ans);
            }
        }
    }
    public static boolean solve(int l,int r,int mid,int[] arr){
        int n=arr.length;
        int c=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>r){
                sum=0;
                c++;
                continue;
            }
            if(sum+arr[i]>r){
                if(sum<l) return false;
                sum=arr[i];
                c++;
            }
            else {
                sum+=arr[i];
            }
            if(sum>=l && sum<=r) {
                c++;
                sum=0;
            }
        }
        if(sum>=l && sum<=r) c++;
//        System.out.println("c " + mid+ " " + c);
        return c>=mid;
    }
}
