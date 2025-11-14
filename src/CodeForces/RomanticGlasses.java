package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//solved in one go 1300, first attempt submitted yayayyyyyyyyyy
public class RomanticGlasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n = sc.nextInt();
            Map<Long,Long> map=new HashMap<>();
            map.put(0L,1L);
            long sum=0;
            boolean ans=false;
            int f=1;
            for (int i = 0; i < n; i++) {
                long a=sc.nextLong();
                if(!ans){
                    sum+=(f*a);
                    if(!map.containsKey(sum)) map.put(sum,1L);
                    else ans=true;
                    f*=-1;
                }
            }
            System.out.println((ans)?"YES":"NO");
        }
    }
}
