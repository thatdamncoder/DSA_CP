package CodeChef;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.Scanner;

public class LargeDifferences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(i>0) sum+=Math.abs(arr[i]-arr[i-1]);
            }
            long max=sum;
//            System.out.println(sum);
            long j=0;
            for (int i = 0; i < n; i++) {
//                if(k<=arr[i]) continue;
                long ans=binarysearch(i,arr,sum,k);
//                System.out.println(ans);
//                max=Math.max(max,ans);
                if(max<ans){
                    max=ans;
//                    j=i;
                }
            }
//            System.out.println("ans " + j );
            System.out.println(Math.max(max,sum));
        }
    }
    public static long binarysearch(int i,int[] arr,long sum,int k){
        int start=0;
        int end=k;
        long curr=0;
        if(i-1>=0){
            curr+=Math.abs(arr[i]-arr[i-1]);
        }
        if(i+1<arr.length){
            curr+=Math.abs(arr[i]-arr[i+1]);
        }
        long csum=sum-curr;
        long max=sum;
        long m=0;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(mid<=0 || end<=0) break;
//            System.out.println(mid);
            long calc=csum;
            if(i-1>=0){
                calc+=Math.abs(mid-arr[i-1]);
            }
            if(i+1<arr.length){
                calc+=Math.abs(mid-arr[i+1]);
            }
            if(calc<=max) {
                end=mid-1;
//                start=mid+1;
            }
            else{
                if(max<calc){
                    m=mid;
                    max=calc;
                }
                start=mid+1;
//                end=mid-1;
            }
        }
//        System.out.println(i + " " + m);
        return max;
    }
    public static long linearsearch(int i,int[] arr,long sum,int k){
        int n=arr.length;
        long curr=0;
        if(i-1>=0){
            curr+=Math.abs(arr[i]-arr[i-1]);
        }
        if(i+1<arr.length){
            curr+=Math.abs(arr[i]-arr[i+1]);
        }
        long csum=sum-curr;
        long max=sum;
        long m=0;
        for (int j = 1; j <=k ; j++) {
            long calc=csum;
            if(i-1>=0){
                calc+=Math.abs(j-arr[i-1]);
            }
            if(i+1<arr.length){
                calc+=Math.abs(j-arr[i+1]);
            }
            max=Math.max(max,calc);
        }
        return max;
    }
}
