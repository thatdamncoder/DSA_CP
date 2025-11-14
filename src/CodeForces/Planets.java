package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Planets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int count=0;
            int sum=0;
            Arrays.sort(arr);
            int ele=arr[0];
            for (int i = 0; i < n; ) {
                if(arr[i]!=ele){
                    sum+=Math.min(count,c);
                    ele=arr[i];
                    count=0;
                }
                count++;
                i++;
            }
            sum+=Math.min(count,c);
            System.out.println(sum);
        }
    }
}
