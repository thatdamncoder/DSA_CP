package CodeForces;

import java.util.Scanner;

public class ShiftsandSortings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            char[] arr=s.toCharArray();
            int n=s.length();
            long ans=0;
            int last=-1;
            for (int i = 0; i < n; i++) {
                if(arr[i]=='1' && last==-1) last=i;
                if(i>0 && last<n && arr[i]=='0' && arr[i-1]=='1'){
                    ans+=i-last+1;
                    arr[i]='1';
                    last++;
                }
            }
            System.out.println(ans);
        }
    }
}
