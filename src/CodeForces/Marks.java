package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String[] arr=new String[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.next();
            }
            int[] max=new int[m];
            for (int j = 0; j < m; j++) {
                int maxx=0;
                for (int i = 0; i < n; i++) {
                    maxx=Math.max(maxx,arr[i].charAt(j)-'0');
                }
                max[j]=maxx;
            }
            Set<Integer> set=new HashSet<>();
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    if(arr[i].charAt(j)-'0' == max[j]){
                        set.add(i);
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}
