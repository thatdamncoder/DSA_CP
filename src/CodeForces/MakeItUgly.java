package CodeForces;

import java.util.Scanner;

public class MakeItUgly {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            if(arr[0]!=arr[n-1]){
                System.out.println(-1);
                continue;
            }
            int count=0;
            for(int i=1;i+1<n;){
                if(arr[i]==arr[0]){
                    i++;
                    continue;
                }
                int ele=arr[i-1];
                int j=i+1;
                while(j<n && ele==arr[j]){
                    count++;
                    j++;
                }
                if(j==n || (j<n && ele!=arr[j])) break;
                else i++;
            }
            int countback=0;
            for(int i=n-2;i-1>=0;){
                if(arr[i]==arr[n-1]){
                    i--;
                    continue;
                }
                int ele=arr[i+1];
                int j=i-1;
                while(j>=0 && ele==arr[j]){
                    countback++;
                    j--;
                }
                if(j<0 || (j>=0 && ele!=arr[j])) break;
                else i--;
            }
            if(count==0 && countback==0) System.out.println(-1);
            else if(count==0) System.out.println(countback);
            else if(countback==0) System.out.println(count);
            else System.out.println(Math.min(count,countback));
        }
    }
}
