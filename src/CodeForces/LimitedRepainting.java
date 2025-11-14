package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LimitedRepainting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[n];
            List<Integer> list = new ArrayList<>();
            list.add(0);
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(s.charAt(i)=='B') {
                    arr[i] *= -1;
                }
                list.add(Math.abs(arr[i]));
            }
            Collections.sort(list);
            long ans=list.get(list.size()-1);
            int start=0;
            int end=list.size()-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                boolean isPossible=check(list.get(mid),arr,k);
                if(isPossible) {
                    ans=Math.min(ans,list.get(mid));
                    start=mid+1;
                }
                else end=mid-1;
            }
            if(start==0) ans=0;
            System.out.println("---------------------- " + ans);
        }
    }
    public static boolean check(int target,int[] arr,int k){
        System.out.println("CHECKING FOR " + target);
        int moves=0;
        int start=-1;
        int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                total--;
                start=i;
                break;
            }
        }
        if(start==-1) return true;
        boolean st=true;
        int i=0;
        for (i = start; i < n;) {
            if (arr[i] < 0) {
                st=true;
                System.out.println(arr[i]);
                while (i < n) {
                    if(arr[i]<0) total--;
                    if (arr[i] > 0 && arr[i] < target) {
                        moves++;
                        System.out.println("ending "+ arr[i]);
                        st=false;
                        break;
                    }
                    i++;
                }
            } else i++;
        }
        if(st) moves++;
        System.out.println("moves " + moves);
        return i==n && moves<=k;
    }
}
/*
4 1
BRBR
-9 5 -3 4
*/