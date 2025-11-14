package RandomTry;

import java.util.*;

public class LongDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> outermap = new HashMap<>();
        for (int num : arr) {
            outermap.put(num, outermap.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int s = 2; s <= 2 * n; s++) {
            Map<Integer, Integer> map = outermap;
            int maxPairs = 0;
            for (int num : arr) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    int complement = s - num;
                    if ((complement != num && map.getOrDefault(complement, 0) > 0) ||
                            (complement == num && map.getOrDefault(complement, 0) > 1)) {
                        maxPairs++;
                        map.put(num, map.get(num) - 1);
                        map.put(complement, map.get(complement) - 1);
                    }
                }
            }
            max = Math.max(max, maxPairs);
        }
        System.out.println(max);
    }
}
//    public static int maxPairsWithSum(int[] arr, int s) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        int maxPairs = 0;
//        for (int num : arr) {
//            if (map.containsKey(num) && map.get(num) > 0) {
//                int complement = s - num;
//                if ((complement != num && map.getOrDefault(complement,0)>0) ||
//                        (complement == num && map.getOrDefault(complement,0) > 1)) {
//                    maxPairs++;
//                    map.put(num, map.get(num) - 1);
//                    map.put(complement, map.get(complement) - 1);
//                }
//            }
//        }
//        return maxPairs;
//    }
//}

//package RandomTry;
//
//import java.util.Scanner;
//
//public class LongDistance {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        while (num-- != 0) {
//            int dp = sc.nextInt();
//            int sp = sc.nextInt();
//            int rp = sc.nextInt();
//            int da = sc.nextInt();
//            int sa = sc.nextInt();
//            int ra = sc.nextInt();
//
//            double ap = (dp * 1.0 / sp) + rp;
//            double aa = (da * 1.0 / sa) + ra;
//            if(ap<=aa){
//                System.out.println(ap==aa?"BOTH":"PAUL");
//                System.out.println(ap);
//            }
//            else{
//                System.out.println("NINA");
//                System.out.println(aa);
//            }
//
//        }
//    }
//}
