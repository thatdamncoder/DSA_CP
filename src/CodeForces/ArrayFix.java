package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayFix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            boolean issorted=true;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(i-1>=0 && arr[i-1]>arr[i]) issorted=false;
            }
            if(issorted){
                System.out.println("YES");
                continue;
            }
            boolean ok=false;
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n;) {
                list.add(arr[i]);
                if(i-1>=0 && arr[i-1]>arr[i]){
                    ok=false;
                    if(list.size()-1>=0) list.remove(list.size()-1);
                    if(list.size()-1>=0) list.remove(list.size()-1);
                    boolean sf=arr[i-1]%10==arr[i-1];
                    boolean ss=arr[i]%10==arr[i];
                    if(sf && ss && arr[i-1]<=arr[i]) {
                        ok=true;
                        list.add(arr[i-1]);
                        list.add(arr[i]);
                    }
                    else if(sf && !ss){
                        if(arr[i-1]<=arr[i]/10 && arr[i]/10<=arr[i]%10){
                            ok=true;
                            list.add(arr[i-1]);
                            list.add(arr[i]/10);
                            list.add(arr[i]%10);
                        }
                    }
                    else if(!sf && ss){
                        if(arr[i-1]/10<=arr[i-1]%10 && arr[i-1]%10<=arr[i]) {
                            ok=true;
                            list.add(arr[i-1]/10);
                            list.add(arr[i-1]%10);
                            list.add(arr[i]);
                        }
                    }
                    else if(sf && ss) {
                        if (arr[i - 1] / 10 <= arr[i - 1] % 10 &&
                                arr[i - 1] % 10 <= arr[i] / 10 &&
                                arr[i] / 10 <= arr[i] % 10
                        ) {
                            ok = true;
                            list.add(arr[i-1]/10);
                            list.add(arr[i-1]%10);
                            list.add(arr[i]/10);
                            list.add(arr[i]%10);
                        }
                    }
                    if(!ok) break;
                    else i++;
                }
                else {
//                    list.add(arr[i]);
                    i++;
                }
            }
//            System.out.println(list);
            if(!ok) System.out.println("NO");
            else{
                for (int i = 1; i < list.size() && ok; i++) {
                    if(list.get(i-1)>list.get(i)) ok=false;
                }
                System.out.println(ok?"YES":"NO");
            }
        }
    }

}
