package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JohnnyAndHisHobbies {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                list.add(a);
            }
            boolean ok=true;
            int ans=-1;
            for (int k = 1; k < 1024; k++) {
                ok=true;
                for (int i = 0; i < n && ok; i++) {
                    if(!list.contains(list.get(i)^k)) ok=false;
                }
                if(ok){
                    ans=k;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
