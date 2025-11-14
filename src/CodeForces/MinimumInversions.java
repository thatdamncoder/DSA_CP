package CodeForces;

import java.util.*;

public class MinimumInversions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++){
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                b[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                map.put(a[i], b[i]);
            }
            //sorting the first array
            for (int i = 1; i <=n; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
            for (int i = 1; i <= n; i++) {
                System.out.print(map.get(i)+" ");
            }
            System.out.println();
        }
    }
}
