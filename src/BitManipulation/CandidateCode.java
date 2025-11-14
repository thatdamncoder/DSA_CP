package BitManipulation;
import java.util.*;
import java.io.*;

public class CandidateCode {
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
            Map<Integer, Integer> map = new HashMap<>(outermap);
            int maxPairs = 0;
            for (int i=0;i<n;i++) {
                int num=arr[i];
                if (map.containsKey(num) && map.get(num) > 0) {
                    int complement = s - num;
                    if(!map.containsKey(complement)) continue;
                    boolean not=complement != num && map.get(complement) > 0;
                    boolean yes=complement == num && map.get(complement) > 1;
                    if (not || yes) {
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
