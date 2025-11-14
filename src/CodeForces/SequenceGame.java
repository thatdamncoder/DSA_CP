package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
//                arr[i]=sc.nextInt();
                list.add(sc.nextInt());
            }
//            System.out.print(arr[0] + " ");
            for (int i = 1; i < n; i++) {
                if(list.get(i)>=list.get(i-1)){
//                    System.out.print(arr[i] + " ");
                }else{
                    if(list.get(i)+1==list.get(i-1)){
                        list.add(i,list.get(i));
//                        System.out.print(arr[i] + " ");
                    }
                    else{
                        list.add(i,list.get(i)-1);
//                        System.out.print(arr[i]-1 + " ");
                    }

//                System.out.print(arr[i]+ " ");
                }
            }
//            System.out.println();
            System.out.println(list.size());
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
