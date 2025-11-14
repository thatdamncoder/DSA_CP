package RandomTry;

import java.util.*;

public class OptimisingCompetition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int num=1;
//        while(num--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int ans=0;
            int max=0;
            for (int s = 2; s <=2*n; s++) {
                int teams=maxPairsWithSum(arr,s);
                if(max<teams){
                    max=teams;
                    ans=s;
                }
            }
            System.out.println(max);
//        }
    }
    public static int maxPairsWithSum(int[] arr, int s) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxPairs = 0;
        for (int num : arr) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                int complement = s - num;
                if ((complement != num && frequencyMap.getOrDefault(complement,0)>0) ||
                (complement == num && frequencyMap.getOrDefault(complement,0) > 1)) {
                    maxPairs++;
                    frequencyMap.put(num, frequencyMap.get(num) - 1);
                    frequencyMap.put(complement, frequencyMap.get(complement) - 1);
                }
            }
        }

        return maxPairs;
    }
}
