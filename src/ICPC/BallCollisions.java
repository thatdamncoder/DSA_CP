package ICPC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BallCollisions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Map<Long,Integer> map=new HashMap<>();
            int[][] x=new int[n][2];
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                x[i]=new int[]{a,b};
            }
            for (int i = 0; i < m; i++) {
                long mul=sc.nextLong();
                mul*=sc.nextLong();
                map.put(mul,map.getOrDefault(mul,0)+1);
            }
            int count=0;
            for(int i=0;i<n;i++){
                long mul= (long) x[i][0] *x[i][1];
                if(map.containsKey(mul)){
                    if(map.get(mul)==1) map.remove(mul);
                    else map.put(mul,map.get(mul)-1);
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
