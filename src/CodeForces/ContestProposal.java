package CodeForces;

import java.util.Scanner;

public class ContestProposal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            long count=0;
            int i=0;
            int j=0;
            while(i<n && j<n){
                if(a[i]<=b[j]) {
                    i++;
                    j++;
                }
                else{
                    count++;
                    j++;
                }
            }
            System.out.println(count);
        }
    }
}
