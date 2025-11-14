package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Equalise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            long[] arr=new long[n];
            List<Long> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
//                list.add(arr[i]);
            }
            Arrays.sort(arr);
            long count=1;
            for (int i = 1; i < n; i++) {
                long e = arr[i] - arr[i - 1];
                if(e <n && !list.contains(Math.abs(e))){
                    count++;
                    list.add(Math.abs(e));
                }
            }
            System.out.println(count);
        }
    }
}
