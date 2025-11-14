//package CodeForces;
//
//import java.util.*;
//
//public class BasicDataTypes {
//    public static void main(String[] args){
//        int[] arr={2,2,3,2,5,2,};
//        System.out.println(countPairs(arr,3));
//    }
//    public static void segregate(int[] arr){
//        int n=arr.length;
//        int i=0;
//        for (int j = 0; j < n; j++) {
//            if(arr[j]%2==0){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//            }
//        }
//    }
//    public static int goodElements(int[] arr){
//        //all elements to the right are smaller
//        int count=1;
//        int n=arr.length;
//        int max=arr[n-1];
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]>max) count++;
//            max=Math.max(max,arr[i]);
//        }
//        return count;
//    }
//    public static int minoperations(char[] arr){
//        int[] even=new int[26];
//        int[] odd=new int[26];
//        int n=arr.length;
//        int e=0;
//        int o=0;
//        for(int i=0;i<n;i++){
//            if(i%2==0) even[arr[i]-'a']++;
//            else odd[arr[i]-'a']++;
//            e=Math.max(e,even[arr[i]-'a']);
//            o=Math.max(o,odd[arr[i]-'a']);
//        }
//        return n-e-o;
//    }
//    public static void diagonalmirror(int[][] arr){
//        int n=arr.length;
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < n-i; j++) {
//                int temp=arr[n-j-1][n-i-1];
//                arr[n-j-1][n-i-1]=arr[i][j];
//                arr[i][j]=temp;
//            }
//        }
//    }
//    public static int countPairs(int[] arr,int k){
//        int n=arr.length;
//        Map<Integer,Integer> map=new HashMap<>();
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(i>k) map.put(arr[i-k-1],map.get(arr[i-k-1])-1);
//            count+=map.getOrDefault(arr[i],0);
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        return count;
//    }
//    public static void print(int[][] arr){
//        int n=arr.length;
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void medianKSize(int[] arr,int k){
//        int n=arr.length;
//        TreeMap<Integer,Integer> map=new TreeMap<>();
//        for()
//    }
//}
