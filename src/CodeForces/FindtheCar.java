package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheCar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int que=sc.nextInt();
            int[] a=new int[k];
            int[] b=new int[k];
            for (int i = 0; i < k; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                b[i]=sc.nextInt();
            }
            int[] q=new int[que];
            for (int i = 0; i < que; i++) {
                q[i] = sc.nextInt();
            }
            double[] speed=new double[k];
            double[] cum=new double[k];
            for (int i = 0; i < k; i++) {
                if(i==0) {
                    speed[i]=a[i]*1.0/b[i];
                }
                else speed[i]=(a[i]-a[i-1])*1.0/(b[i]-b[i-1]);
                cum[i]+=(i-1>=0?cum[i-1]:0);
            }
            for (int i = 0; i < que; i++) {
                int index=binarysearch(q[i],a);
                if(index==-1){
                    long ans=(long)Math.floor(q[i]*1.0/speed[0]);
                    System.out.print(ans+ " ");
                }
                else{
                    long full=(long)Math.floor(1.0*b[index]);
                    if(index+1<k){
                        full+=(long)Math.floor((q[i]-a[index])*1.0/speed[index+1]);
                    }
                    System.out.print(full + " ");
                }
            }
            System.out.println();
        }
    }

    private static int binarysearch(int i, int[] a) {
        int start=0;
        int end=a.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(i==a[mid]) return mid;
            else if(i<a[mid]) {
                end=mid-1;
            }
            else {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
