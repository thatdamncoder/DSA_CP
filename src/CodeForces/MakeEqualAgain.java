package CodeForces;

import java.util.Scanner;

public class MakeEqualAgain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int endi=0;
            int elei=arr[0];
            for (int i = 1; i < n; i++) {
                if(arr[i]!=elei) break;
                endi=i;
            }
            int elej=arr[n-1];
            int startj=n-1;
            for (int j = n-2; j >=0 ; j--) {
                if(arr[j]!=elej) break;
                startj=j;
            }
            int ele=0;
            boolean f=false;
            if(endi+1>(n-1-startj+1)){
                ele=elei;
                f=true;
            }
            else ele=elej;
            int count=0;
            if(f){
                count=n-1-endi;
                count-=(elej==ele)?(n-startj):0;
            }
            else{
                count=startj;
                count-=(elei==ele)?(endi+1):0;
            }
            System.out.println(Math.max(count,0));
        }
    }
}
