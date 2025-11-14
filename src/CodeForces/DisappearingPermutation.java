package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DisappearingPermutation {
    static class DSU {
        int[] rank;
        int[] parent;
        int[] size;
        public DSU(int n){
            rank=new int[n];
            parent=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                size[i]=1;
                parent[i]=i;
            }
        }
        public int findParent(int a){
            if(a==parent[a]) return a;
            return parent[a]=findParent(parent[a]);
        }
        public void unionBySize(int a,int b){
            int parenta=findParent(a);
            int parentb=findParent(b);
            if(parenta==parentb) return;
            if(size[parenta]>size[parentb]){
                parent[parentb]=parenta;
                size[parenta]+=size[parentb];
            }
            else if(size[parenta]<=size[parentb]){
                parent[parenta]=parentb;
                size[parentb]+=size[parenta];
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] d=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt()-1;
            }
            for (int i = 0; i < n; i++) {
                d[i]=sc.nextInt()-1;
            }
            DSU ds=new DSU(n);
            for (int i = 0; i < n; i++) {
                ds.unionBySize(i,arr[i]);
            }
            Set<Integer> set=new HashSet<>();
            long ans=0;
            for (int i = 0; i < n; i++) {
               int parent=ds.findParent(d[i]);
               if(set.add(parent)) ans+=ds.size[parent];
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
