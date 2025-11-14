package CodeForces;

import java.util.*;
import java.util.function.LongFunction;

public class DivisiblePairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            long count=0;
            Map<String,Long> map=new HashMap<>();
            for (int i =n-1; i >=0 ; i--) {
                int find1=(x-(arr[i]%x))%x;
                int find2=(arr[i]%y);
                String temp=find1+"_"+find2;
                if(map.containsKey(temp)){
                    count+=map.get(temp);
                }
                String put=(arr[i]%x)+"_"+(arr[i]%y);
                map.put(put,map.getOrDefault(put,0L)+1);
            }
            System.out.println(count);
        }
    }
}
