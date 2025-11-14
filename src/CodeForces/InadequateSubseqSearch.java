package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InadequateSubseqSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            int count=0;
            int i=0;
            int j=0;
            int ans=0;
            while(i<n && j<n){
                if(map.containsKey(arr[j])){
                    map.put(arr[j],map.get(arr[j])-1);
                    if(map.get(arr[j])==0) count++;
                }
                if(j-i+1<m) j++;
                else{
                    if(count>=k) ans++;
                    if(map.containsKey(arr[i])) {
                        map.put(arr[i],map.get(arr[i])+1);
                        if(map.get(arr[i])>0) count--;
                    }
                    i++; j++;
                }
            }
            System.out.println(ans);
        }
    }
}
