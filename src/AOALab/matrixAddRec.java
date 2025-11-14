package AOALab;

public class matrixAddRec {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1={{1,1,1},{1,1,1},{1,1,1}};
//        rec(0,0,arr,arr1);
        long n=(long)1e18;
        System.out.println(rec(n));
//        System.out.println(rec1(n));
    }
    public static void rec(int i,int j,int[][] arr,int[][] arr1){
        if(i>=arr.length) return;
        if(j>=arr[0].length) {
            System.out.println();
            rec(i+1,0,arr,arr1);
            return;
        }
        System.out.print(arr[i][j]+arr1[i][j]+" ");
        rec(i,j+1,arr,arr1);
    }
    public static long rec(long n){
        if(n==1) return 0L;
        return rec(n/2)+n;
    }
    public static long rec1(long n){
        long ans=0;
        for (int i = 0; i < n; i++) {
            ans+=n;
        }
        return ans;
    }
}
