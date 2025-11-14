package CodeForces;

import java.util.*;

public class IIWCPC3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextLong();
            }
            long[] prefix=new long[n+1];
            for (int i=0;  i < n; i++) {
                prefix[i+1] = prefix[i] + arr[i];
            }
            Deque<Integer> dq= new ArrayDeque<>();
            long max= Long.MIN_VALUE;

            for (int r = 0; r < n; r++) {
                int l=r-a+1;
                if (l>=0){
                    while (!dq.isEmpty() && prefix[dq.peekLast()]>=prefix[l]) {
                        dq.pollLast();
                    }
                    dq.addLast(l);
                }
                int llast = r-b+ 1;
                while (!dq.isEmpty() && dq.peekFirst() < llast) {
                    dq.pollFirst();
                }
                if (!dq.isEmpty()) {
                    int lmin = dq.peekFirst();
                    max = Math.max(max, prefix[r+1]-prefix[lmin]);
                }
            }

//            long max=Long.MIN_VALUE;
//            long curr=0;
//            int i=0;
//            int j=0;
//            while(j < n){
//                if(curr+arr[j] <=0 ){
//                    if(a<=j-i+1 && j-i+1 <= b){
//                        max=Math.max(max,curr);
//                    }
//                    i=j;
////                    j++;
//                }
//                else if(j-i+1>b){
//                    while()
//                    if(a<=j-i+1 && j-i+1 <= b){
//                        max=Math.max(max,curr);
//                    }
//                    i++;
////                    j++;
//                }
//                else{
//                    curr+=arr[j];
//                }
//                j++;
//            }
            System.out.println(max);
        }
    }
}
