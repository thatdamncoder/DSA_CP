package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InformaticsinMAC {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                list.add(i+1);
            }
            int[] prefix=new int[n];
            int[] suffix=new int[n];
            int p=0;
            for (int i = 0; i < n; i++) {
                while(p<list.size() && arr[i]==list.get(p)) p++;
                if(p<list.size()) prefix[i]=list.get(p);
                list.remove(Integer.valueOf(arr[i]));
            }
            list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i+1);
            }
            p=0;
            boolean ok=false;
            int i=n-1;
            for (i = n-1; i >=0 && !ok; i--) {
                while(p<list.size() && arr[i]==list.get(p)) p++;
                if(p<list.size()) suffix[i]=list.get(p);
                list.remove(Integer.valueOf(arr[i]));
//                if(arr[i]==list.get(p)) suffix[i]=list.get(p);
//                else p++;
//                if(prefix[i]==suffix[i]) ok=true;
//                list.remove(Integer.valueOf(arr[i]));
            }
            System.out.println("PREFIX " + Arrays.toString(prefix));
            System.out.println("SUFFIX " + Arrays.toString(suffix));
            if(!ok) System.out.println(-1);
            else{
                System.out.println(2);
                System.out.println(1 + " " + (i+1));
                System.out.println((i+2) + " " + n);
            }
        }
    }
}
/*
2
1 1
2 2
-1
3
1 3
4 5
6 8
3
1 1
2 2
3 3
-1
 */