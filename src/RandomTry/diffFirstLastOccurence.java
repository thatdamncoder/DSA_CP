package RandomTry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class diffFirstLastOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Map<Integer,int[]> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new int[] {i,i});
            }else{
                map.get(arr[i])[1]=i;
            }
        }
        for (int i = 0; i < n; i++) {
            int[] diff=map.get(arr[i]);
            System.out.print(diff[1]-diff[0] + " ");
        }
        System.out.println();
    }
}
