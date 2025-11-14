package CodeForces;

import java.util.*;

public class ReversetheRivers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[][] arr=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            genMatrix(arr);
//            for(int j=0;j<n;j++) System.out.println(Arrays.toString(arr[j]));
            for (int i = 0; i < k; i++) {
                int q=sc.nextInt();
                Map<Integer,Integer> map=new HashMap<>();
                List<int[]> list=new ArrayList<>();
                int min=m+1;
                for (int j = 0; j < q; j++) {
                    int a=sc.nextInt()-1;
                    String ch=sc.next();
                    int b=sc.nextInt();
                    if(!map.containsKey(a)){
                        map.put(a,list.size());
                        list.add(new int[3]);
                        list.get(map.get(a))[0]=a;
                    }
                    int ind=map.get(a);
                    if(ch.equals(">")) list.get(ind)[1]=b;
                    else list.get(ind)[2]=b;
                    min=Math.min(min,a);
                }
//                for(int j=0;j<m;j++) System.out.println(Arrays.toString(col[j]));
                int ans=getCol(list,arr);
                System.out.println(ans);
            }

        }
    }
    public static int getCol(List<int[]> list,int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int start=0;
        int end=n-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            int poss=satisfiesAll(mid,list,arr);
            if(poss==0 || poss==2){
                if(poss==0) ans=Math.min(ans,mid+1);
                end=mid-1;
            }
            else start=mid+1;

        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static int satisfiesAll(int mid,List<int[]> list,int[][] arr){
        for (int i = 0; i < list.size(); i++) {
            int[] co=list.get(i);
            int a=co[0];
            int b1=co[1];
            int b2=co[2];
            if(!(arr[mid][a]>b1)){
                return 1;
            }
            if(!(arr[mid][a]<b2)){
                return 2;
            }
        }
        return 0;
    }
    public static void genMatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                arr[i][j]|=arr[i-1][j];
            }
        }
    }

}
/*
3 4 1
1 3 5 9
4 6 5 3
2 1 2 7
3
1 > 4
2 < 8
1 < 6
 */