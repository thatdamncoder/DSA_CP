package CodeForces;

import java.util.*;

public class ArrayRecoloring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                int sumK = 0;
                for (int j = i; j < n; j++) {
                    minHeap.add(arr[j]);
                    int oextra = 0;
                    if (minHeap.size() > k+1) {
                        minHeap.poll();
                    }
                    if (j - i + 1 >= k) {
                        sumK = minHeap.stream().mapToInt(Integer::intValue).sum(); //one liner sum ke liye
                        if(minHeap.size() > k) sumK-= minHeap.peek();

                        int extra = 0;
                        if (i != 0) extra = Math.max(extra, arr[0]);
                        if (j != n-1) extra = Math.max(extra, arr[n-1]);
                        if (minHeap.size() > k) extra = Math.max(extra, minHeap.peek());

                        max = Math.max(max, sumK + extra);
                    }
                }
            }
            System.out.println(max);
        }
    }
}
