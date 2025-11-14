package RandomTry;

import java.util.Arrays;
import java.util.Comparator;

public class longlong {
    public static void main(String[] args) {
        int a=-2147483645;
        int b=2147483646;
//        System.out.println(b<=a);
        int[][]arr= {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        System.out.println(mergeintervals(arr));
    }
    public static int mergeintervals(int[][] arr) {
        int n=arr.length;
//        Arrays.sort(arr,(a, b)->(long)a[0]-(long)b[0]);
        Arrays.sort(arr, (a,b)->Long.compare((long)a[0],(long)b[0])==0?Long.compare((long)a[1],(long)b[1]):
                Long.compare((long)a[0],(long)b[0]));
//        Arrays.sort(arr, (a,b)->(
//                (long)a[0]==(long)b[0]?(long)a[1]-(long)b[1]:(long)a[0]-(long)b[0]
//                ));


        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        int size=n;
        long start=arr[0][0];
        long end=arr[0][1];
        for(int i=1;i<n;){
            while(i<n && (long)arr[i][0]<=end){
                System.out.println((long)arr[i][0] +" < " + end);
                start=arr[i][1];
                // end=Math.max(end,arr[i][1]);
                size--;
                i++;
            }
            if(i<n && (long)arr[i][0]>end){
                start=arr[i][0];
                end=(long)arr[i][1];
                i++;
            }
        }
        return size;
    }
}
