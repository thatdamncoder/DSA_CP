package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobInterview {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int pl=sc.nextInt();
            int tl=sc.nextInt();
            int n=pl+tl+1;
            long[] p=new long[n];
            long[] t=new long[n];
            long sumt=0;
            long sump=0;
            int min=Math.min(pl,tl);
            for (int i = 0; i < n; i++) {
                p[i]=sc.nextLong();
                if(min!=pl) sump+=p[i];
            }
            for (int i = 0; i < n; i++) {
                t[i]=sc.nextLong();
                if(min!=tl) sumt+=t[i];
            }
            int temp=min;
            for (int i = 0; i < n && temp>0; i++) {
                if(min==pl && p[i]>t[i]){
                    sump+=p[i];
                    sumt-=t[i];
                    temp--;
                }
                else if(min==tl && p[i]<t[i]){
                    sumt+=t[i];
                    sump-=p[i];
                    temp--;
                }

            }

            List<Integer> list=new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if((min==pl && p[i]>t[i]) || (min==tl && t[i]>p[i])){
                    list.add(i);
                }
            }
//            System.out.println(sump + " " + sumt);
//            System.out.println(list);
//            int start=(!list.isEmpty())?list.get(0):n+2;
//            int end=(min-1>=0)?list.get(min-1):n+2;
            long[] ans=new long[n];
            for (int i = 0; i < n; i++) {
                boolean is= !list.isEmpty() && isInRange(list, i, min - 1);
                if(min==tl){
                    if(is){
                        ans[i]=(sumt-t[i]) + t[list.get(min)];
                        ans[i]+=sump - p[list.get(min)];
                    }
                    else{
                        ans[i]=sumt + sump - p[i];
                    }
                }
                else {
                    if(is){
                        ans[i]=(sump-p[i]) + p[list.get(min)];
                        ans[i]+=sumt - t[list.get(min)];
                    }
                    else{
                        ans[i]=sump + sumt - t[i];
                    }
                }
            }
            for(long i:ans) System.out.print(i + " ");
            System.out.println();
        }
    }
    public static boolean isInRange(List<Integer> list,int target,int e){
//        if(list.get(0)==target) return true;
//        int start=0;
//        int end=e;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(list.contains(mid) && list.get(mid)==target) return true;
//            else if(list.contains(mid) && list.get(mid)>target) end=mid-1;
//            else start=mid+1;
//        }
        return false;
    }
}
/*
my test case
1
3 2
4 5 3 4 1 3
5 3 4 5 2 1
expected-18 17 19 18 21 19
 */