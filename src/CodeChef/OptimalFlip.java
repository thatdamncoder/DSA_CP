package CodeChef;

import java.util.Scanner;

public class OptimalFlip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            long max=0;
            long count=0;
            long add=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]%2!=0) count++;
                else{
                    add+=(count)*(count+1)/2;
                    max=Math.max(max,count);
                    count=0;
                }
            }
            add+=(count)*(count+1)/2;
            max=Math.max(max,count);
            add-=(max/2+1)*(max-(max/2));
            long total= (long) (n) *(n+1)/2;
            System.out.println(total-add);
        }
    }
}