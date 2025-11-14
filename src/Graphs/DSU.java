package Graphs;

public class DSU {
    int[] rank;
    int[] parent;
    int[] size;
    public DSU(int n){
        rank=new int[n+1];
        parent=new int[n+1];
        size=new int[n+1];
        for(int i=0;i<=n;i++){
            size[i]=1;
            parent[i]=i;
        }
    }
    public int findParent(int a){
        if(a==parent[a]) return a;
        return parent[a]=findParent(parent[a]);
    }
    public void unionByRank(int a,int b){
        int parenta=findParent(a);
        int parentb=findParent(b);
        if(parenta==parentb) return;
        if(rank[parenta]<rank[parentb]){
            parent[parenta]=parentb;
        }
        else if(rank[parentb]<rank[parenta]){
            parent[parentb]=parenta;
        }
        else{
            parent[parenta]=parentb;
            rank[parentb]++;
        }
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
