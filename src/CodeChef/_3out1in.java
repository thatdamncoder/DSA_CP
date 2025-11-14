package CodeChef;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _3out1in {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int que=sc.nextInt();
            int[] arr=new int[n];
            int[] prefix=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(i==0) prefix[i]=arr[i];
                else prefix[i]=prefix[i-1]+arr[i];
            }
            int[] q=new int[que];
            for (int i = 0; i < que; i++) {
                q[i]=sc.nextInt();
            }
            for (int i = 0; i < que; i++) {
                int k=q[i];
                PriorityQueue<Integer> queue=new PriorityQueue<>();
                for (int j = 0; j < k; j++) {
                    queue.offer(arr[j]);
                }
                long sub=0;
                int l=(k)/2;
                while(!queue.isEmpty() && l--!=0){
                    sub+=queue.poll();
                }
                long ans=prefix[k-1]-2*(sub);
                System.out.print(ans+ " ");
            }

        }
    }
}
