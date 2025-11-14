package CodeForces;

import java.util.*;

public class LCMaxSumofNodeValues {
    public static void main(String[] args) {
        int[] nums={24,78,1,97,44};
        int k=6;
        int[][] edges={{0,2},{1,2},{4,2},{3,4}};
        System.out.println(logic(nums,k,edges));
    }
    public static long logic(int[] nums, int k, int[][] edges) {
        long sum=0;
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int[] xor=new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            xor[i]=nums[i]^k;
            if(xor[i]>nums[i]) set.add(i); //check equals to
        }
        System.out.println(Arrays.toString(xor));
        if(set.isEmpty()) return sum;
        long orig=sum;
        sum=0;
        List<Integer> list=new ArrayList<>();
        for(int[] arr:edges){
            if(set.isEmpty()) break;
            if(set.contains(arr[0]) && set.contains(arr[1])){
                list.add(arr[0]);
                list.add(arr[1]);
                set.remove(arr[0]);
                set.remove(arr[1]);
            }
        }
        for(int i=0;i<n;i++){
            if(list.contains(i)) sum+=xor[i];
            else sum+=nums[i];
        }
        return Math.max(sum,orig);

    }
}
