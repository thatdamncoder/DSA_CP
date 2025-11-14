package CodeForces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChoosingCubes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int f=sc.nextInt()-1;
            int k=sc.nextInt()-1;
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int fav=arr[f];
            Arrays.sort(arr);
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = temp;
            }
//            Collections.reverse(Arrays.asList(arr));
//            System.out.println(Arrays.toString(arr));
            int min=n;
            int max=0;
            int count=0;
            boolean more=false;
//            System.out.println(fav);
            for (int i = 0; i < n; i++) {
                if(arr[i]==fav) {
                    min=Math.min(min,i);
                    max=Math.max(max,i);
                    count++;
                    if(count>1) more=true;
                }
            }
//            System.out.println(more);
            if(!more){
                min=max;
            }
//            System.out.println(min + " " + max);
            if(min<=k && max<=k) System.out.println("YES");
            else if(min>k && max>k) System.out.println("NO");
            else System.out.println("MAYBE");
//            }
//            else{
//                if(min<=k) System.out.println("YES");
//                else System.out.println("NO");
//            }
        }
    }
}
