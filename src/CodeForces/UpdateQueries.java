package CodeForces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateQueries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            int[] arr=new int[m];
            for (int i = 0; i < m; i++) {
                arr[i]=sc.nextInt();
                arr[i]--;
            }
            String t=sc.next();
            Arrays.sort(arr);
            char[] carr=t.toCharArray();
            Arrays.sort(carr);
            char[] a=s.toCharArray();
            int j=0;
            for (int i = 0; i < m; ) {
                int e=arr[i];
                a[e]=carr[j++];
                if(i+1<m && arr[i+1]==e){
                    while(i+1<m && arr[i+1]==e) {
                        i++;
                    }
                    i++;
                }
                else {
//                    a[e]=carr[i];
                    i++;
                }
            }
            for(char ch:a) System.out.print(ch);
            System.out.println();
        }
    }
}
