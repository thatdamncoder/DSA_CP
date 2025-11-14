package CodeForces;

import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int neg=0;
            int sum=0;
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]<0) neg++;
                sum+=arr[i];
            }

            int pos=n-neg;
            int ans=0;
            if(neg%2!=0){
                ans++;
                int temp1=neg+1;
                int temp2=neg-1;
                int tempans=Integer.MAX_VALUE;
                if(n-temp1<temp1) tempans=Math.min(tempans,temp1-(n-temp1));
                if(n-temp2<temp2) tempans=Math.min(tempans,temp2-(n-temp2));

            }

//            if(n-neg>=neg) System.out.println(ans);
//            else System.out.println(neg-(n-neg));
//            if(sum<0) System.out.println(Math.abs(sum)+1);
//            else System.out.println(1);

//            int ans=0;
////
//            ans+=(sum>=0)?0:(Math.abs(sum));
//            if(sum<0) neg=-(Math.abs(sum));
////            ans+=(neg-(sum<0?sum:0));
//            if(neg%2==0) ans+=1;
//            System.out.println(ans);
        }
    }
}
