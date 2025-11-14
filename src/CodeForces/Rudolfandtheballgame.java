package CodeForces;

import java.util.*;

public class Rudolfandtheballgame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int que=sc.nextInt();
            int start=sc.nextInt();
            int[] q=new int[que];
            int[] dir=new int[que];
            for (int i = 0; i < que; i++) {
                q[i]=sc.nextInt();
                String c=sc.next();
                if(c.equals("0")) dir[i]=0;
                else if(c.equals("1")) dir[i]=1;
                else dir[i]=-1;
            }
            Set<Integer> set=new TreeSet<>();
            set.add(start);

            for (int i = 0; i < que; i++) {
                int dist=q[i];
                int direction=dir[i];
                int s=set.size();
                Set<Integer> temp=new TreeSet<>();
                for (int popped:set) {
                    int f=(popped+dist>n)?(popped+dist)%(n):popped+dist;
                    int b=(popped+n-dist>n)?(popped+n-dist)%(n):popped+n-dist;

                    if(direction==0 || direction==-1) {
                        temp.add(f);
                    }
                    if(direction==1 || direction==-1){
                        temp.add(b);
                    }
                }
                set=temp;
            }
            System.out.println(set.size());
            for (int i:set) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
/*
Queue<Integer> queue=new LinkedList<>();
            queue.offer(start);
            for (int i = 0; i < que; i++) {
                int dist=q[i];
//                String direction=dir[i];
                int direction=dir[i];
                int s=queue.size();
//                System.out.println(queue);
                for (int j = 0; j < s; j++) {
                    int popped=queue.poll();
                    int f=(popped+dist>n)?(popped+dist)%(n):popped+dist;
                    int b=(popped+n-dist>n)?(popped+n-dist)%(n):popped+n-dist;

                    if(direction==0) {
//                        queue.offer((popped + dist)%n);
                        queue.offer(f);
                    }else if(direction==1){
//                        queue.offer((popped + (n-dist))%n);
                        queue.offer(b);
                    }
                    else{
//                        queue.offer((popped + dist)%n);
//                        queue.offer((popped + (n-dist))%n);
                        queue.offer(f);
                        queue.offer(b);
                    }
                }
            }

//            SortedSet<Integer> set=new TreeSet<>();
            Set<Integer> set=new HashSet<>();
            while(!queue.isEmpty()){
                set.add(queue.poll());
//                System.out.print(queue.poll()  +" ");
            }
            System.out.println(set.size());
            for(int i:set){
                System.out.print(i+" ");
            }
            System.out.println();
 */