package CodeChef;

import java.util.*;

public class ChangeAtoB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long a=sc.nextLong();
            long b= sc.nextLong();
            long k= sc.nextLong();
//            double nd=(Math.log(b)-Math.log(a))/Math.log(k);
//            long nl= (long) ((Math.log(b)-Math.log(a))/Math.log(k));
//            if(nd==nl) System.out.println(nl);
//            else{
//                long ans=b-(long)Math.pow(a,nl);
//                System.out.println(ans);
//            }
//            long f=forward(a,b,k);
//            long ba=backward(a,b,k);
//            System.out.println(Math.min(f,ba));
            System.out.println(qu(a,b,k));
        }
    }
    public static long forward(long a,long b,long k){
        long c=0;
        while(a<b){
            a=a*k;
            c++;
        }
//        System.out.println(c);
        if(a==b) return c;
        return --c + (b- (a/k));
    }
    public static long backward(long a,long b,long k){
        long c = 0;
        for (long i = b; i > a; i -= k) {
            c++;
        }
//        System.out.println(c);
        if(a==b) return c;
        return --c + (b % k);
//        return Integer.MAX_VALUE;
    }
    public static long qu(long a,long b,long k){
        if (a == b) {
            return 0;
        }

        Queue<long[]> queue = new LinkedList<>();
        Set<Long> visited = new HashSet<>();

        // Initialize the queue with the starting value and 0 steps
        queue.add(new long[] { a, 0 });
        visited.add(a);

        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long currentValue = current[0];
            long steps = current[1];

            // Generate the next possible values
            long nextValue1 = currentValue + 1;
            long nextValue2 = currentValue * k;

            // Check if we have reached the target value
            if (nextValue1 == b || nextValue2 == b) {
                return steps + 1;
            }

            // Enqueue the next values if they haven't been visited
            if (!visited.contains(nextValue1)) {
                queue.add(new long[] { nextValue1, steps + 1 });
                visited.add(nextValue1);
            }

            if (!visited.contains(nextValue2)) {
                queue.add(new long[] { nextValue2, steps + 1 });
                visited.add(nextValue2);
            }
        }

        // If we exhaust the queue without finding 'b', return -1 (shouldn't happen in theory)
        return -1;
    }
}
