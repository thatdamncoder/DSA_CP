package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class FanumTax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m= sc.nextInt();
            long[] a=new long[n];
            long[] b=new long[m];

            for (int i = 0; i < n; i++) a[i]=sc.nextLong();
            for (int i = 0; i < m; i++) b[i]=sc.nextLong();
            Arrays.sort(b);
            long max=Math.max(b[m-1]-a[n-1],a[n-1]);
            a[n-1]=max;
            boolean ok=true;
            for (int i = n-2; i >=0 ; i--) {
                long ub=a[i]+a[i+1];
                long sub=binarysearch(ub,b)-a[i];
                if(a[i]>a[i+1] && sub>a[i+1]) {
                    ok=false;
                    break;
                }else{
                    if(Math.max(a[i],sub)<=a[i+1]) {
                        a[i] = Math.max(a[i], sub);
                    } else if(sub<=a[i+1]) a[i]=sub;
                }
            }
            if(!ok) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    public static long binarysearch(long target,long[] arr){
        int start=0;
        int end=arr.length-1;
        long ans=Long.MIN_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=target){
                start=mid+1;
                ans=Math.max(ans,arr[mid]);
            }
            else end=mid-1;
        }
        return ans;
    }
}
