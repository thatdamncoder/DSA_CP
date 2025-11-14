package CodeForces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ThreeActivities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            Map<Integer,Integer> map1=new HashMap<>();
            Map<Integer,Integer> map2=new HashMap<>();
            Map<Integer,Integer> map3=new HashMap<>();
            int n=sc.nextInt();
            int[][] arr=new int[3][n];
            for(int i=0;i<3;i++){
                for(int j=0;j<n;j++) {
                    arr[i][j] = sc.nextInt();
                    if (i == 0) map1.put(arr[i][j], j);
                    else if (i == 1) map2.put(arr[i][j], j);
                    else map3.put(arr[i][j], j);
                }
                Arrays.sort(arr[i]);
            }
            int sum;
            int max=Integer.MIN_VALUE;
            for(int i=n-1;i>=0;i--){
                sum=arr[0][i];
                int limit1=map1.get(arr[0][i]);
                int limit2=0;
                if(map2.get(arr[1][n-1])!=limit1){
                    sum+=arr[1][n-1];
                    limit2=map2.get(arr[1][n-1]);
                }else{
                    if(n-2>=0) {
                        sum += arr[1][n - 2];
                        limit2 = map2.get(arr[1][n - 2]);
                    }

                }
                if(map3.get(arr[2][n-1])!=limit1 && map3.get(arr[2][n-1])!=limit2){
                    sum+=arr[2][n-1];
                }else if(n-2>=0 && map3.get(arr[2][n-2])!=limit1 && map3.get(arr[2][n-2])!=limit2) {
                    sum += arr[2][n-2];
                }else{
                    if(n-3>=0) sum+=arr[2][n-3];
                }
                max=Math.max(max,sum);
            }
            System.out.println(max);
        }

    }

}
