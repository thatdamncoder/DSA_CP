package CodeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Elections {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            int ca=0;
            boolean ok=false;
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if(a[i]>b[i]) ca++;
                else{
                    list.add(b[i]-a[i]+1);
                }
                if(ca>=((n+1)/2)){
                    ok=true;
                    break;
                }
            }
            if(ok) {
                System.out.println("YES");
                continue;
            }
            Collections.sort(list);
            for (int i = 0; i < list.size() && k>0; i++) {
                if(list.get(i)<=k){
                    ca++;
                    k-=list.get(i);
                }
                if(ca>=((n+1)/2)){
                    ok=true;
                    break;
                }
            }
            if(ca>=((n+1)/2)) ok=true;
            System.out.println(ok?"YES":"NO");
        }
    }
}
