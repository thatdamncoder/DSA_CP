package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfAnArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=1;
            int mid=n/2;
            mid-=(n%2==0)?1:0;
            int ele=arr[mid];
            for(int i=mid+1;i<n;i++){
                if(arr[i]<arr[mid]+1){
                    count++;
                }
                else break;
            }
            System.out.println(count);

        }
    }
}
