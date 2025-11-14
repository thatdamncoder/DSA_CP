package CodeForces;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int countBeautifulPairs(int[] a) {
        int n = a.length;
        Map<String, Integer> tripleCountMap = new HashMap<>();

        // Generate all triples and count their occurrences
        for (int j = 0; j <= n - 3; j++) {
            String triple = a[j] + "," + a[j + 1] + "," + a[j + 2];
            tripleCountMap.put(triple, tripleCountMap.getOrDefault(triple, 0) + 1);
        }

        int count = 0;

        // Check for each unique triple and find beautiful pairs
        for (int j = 0; j <= n - 3; j++) {
            String currentTriple = a[j] + "," + a[j + 1] + "," + a[j + 2];
            String[] parts = currentTriple.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            int z = Integer.parseInt(parts[2]);

            // Create potential beautiful triples by changing one element at a time
            String[] candidates = new String[]{
                    "*," + y + "," + z,  // Change the first element
                    x + ",*," + z,       // Change the second element
                    x + "," + y + ",*"   // Change the third element
            };

            // Compare with existing triples
            for (String candidate : candidates) {
                for (String key : tripleCountMap.keySet()) {
                    if (matches(candidate, key)) {
                        count += tripleCountMap.get(key);
                    }
                }
            }

            // Remove the current triple to avoid double counting
            tripleCountMap.put(currentTriple, tripleCountMap.get(currentTriple) - 1);
        }

        return count;
    }

    private static boolean matches(String pattern, String triple) {
        String[] patternParts = pattern.split(",");
        String[] tripleParts = triple.split(",");
        int diffCount = 0;

        for (int i = 0; i < 3; i++) {
            if (!patternParts[i].equals("*") && !patternParts[i].equals(tripleParts[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3, 2, 4};
        System.out.println(countBeautifulPairs(a));  // Output the count of beautiful pairs
    }
}
