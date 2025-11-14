package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class FashionableArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int fodd=-1;
            int lodd=-1;
            int feven=-1;
            int leven = -1;
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                int a = arr[i];
                if (a%2==0) {
                    if(feven==-1) feven=i;
                    leven=i;
                }
                else {
                    if (fodd == -1) fodd = i;
                    lodd = i;
                }
            }
            int min = Math.min(n-(lodd-fodd+1),n-(leven-feven+1));
            System.out.println(min);
        }
    }
}
