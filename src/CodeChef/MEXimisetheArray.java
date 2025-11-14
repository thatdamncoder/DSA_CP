package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class MEXimisetheArray {
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
            int count=0;
            for (int i = 0; i < n; i++) {
                count+=Math.abs(arr[i]-i);
            }
            System.out.println(count);
        }
    }
}
