package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InaccurateSubSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            Map<Integer,Integer> map1=new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int[] b=new int[m];
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                b[i]=sc.nextInt();
                map.put(b[i],map.getOrDefault(b[i],0)+1);
            }
            int ans=0;
            int i=0;
            int j=0;
            while(i<n && j<n){
                //System.out.println(i+ " " + j + " "  + map1 + " " +k);
                if(map.containsKey(a[j])) map1.put(a[j],map1.getOrDefault(a[j],0)+1);
                if(map.containsKey(a[j]) && map1.get(a[j])<=map.get(a[j])){
                    k--;
                }
//                System.out.println(i+ " " + j);
                if(j-i+1>=m){
                    if(k<=0) ans++;
                    if(map1.containsKey(a[i])) {
                        map1.put(a[i],map1.get(a[i])-1);
                        if(map1.get(a[i])<=map.get(a[i])) k++;
                    }
                    i++;
                }
                j++;
            }
            System.out.println(ans);
        }
    }
}
//9 9 2 2 10 9 7 6 3 6 3