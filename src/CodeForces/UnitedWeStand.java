package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            List<Integer> b=new ArrayList<>();
            List<Integer> c=new ArrayList<>();
            Arrays.sort(arr);
            b.add(arr[0]);
            int lastb=arr[0];
            int lastc=0;
            boolean ok=true;
            for (int i = 1; i < n; i++) {
                if(lastb%arr[i]!=0){
                    c.add(arr[i]);
//                    if(lastc!=0 && lastc%arr[i]==0){
//                        ok=false;
//                        break;
//                    }
//                    else
                    lastc=arr[i];
                }
                else{
                    b.add(arr[i]);
                    lastb=arr[i];
                }
            }
            if(!ok || (b.isEmpty() || c.isEmpty())){
                System.out.println(-1);
            }else{
                System.out.println(b.size() + " " +c.size());
                for(int i:b) System.out.print(i+ " ");
                System.out.println();
                for(int i:c) System.out.print(i+ " ");
                System.out.println();
            }
        }
    }
}
