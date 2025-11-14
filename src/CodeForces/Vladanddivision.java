package CodeForces;

import java.util.*;

public class Vladanddivision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            List<Long> list=new ArrayList<>();
//            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                long a=sc.nextLong();
                list.add(a);
            }
//            List<Long> list=new ArrayList<>();
//            list.add(arr[0]);
            int count=0;
            for (int i = 0; i < n; i++) {
//                int bits=(int)(Math.floor(Math.log(arr[i]) / Math.log(2))) +1;
//                if(!list.contains((long)((1L <<bits)-1)^n)) count++;
                if(!list.contains((1L<<31) + (~list.get(i)))) count++;
//                list.add(arr[i]);
            }
            System.out.println(count);
        }
    }
}
