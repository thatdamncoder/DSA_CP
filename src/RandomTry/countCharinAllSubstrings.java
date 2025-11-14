package RandomTry;

import java.util.Arrays;
import java.util.Scanner;

public class countCharinAllSubstrings {
    public static void main(String[] args) {
        String s = "aba";
        int[] counts = uniqueSubstringCounts(s);
        System.out.println(Arrays.toString(counts)); // Output: [3, 4, 3]
    }
    public static int[] uniqueSubstringCounts(String s) {
        int n = s.length();
        int[] charCount = new int[26];
        int totalSubstrings = 0;

        // Iterate through the characters of the string
        for (char c : s.toCharArray()) {
            // Update count of character and total substrings
            totalSubstrings += (charCount[c - 'a'] + 1);
            charCount[c - 'a']++;
        }

        // Initialize array to store result
        int[] result = new int[26];

        // Calculate count of each character in the set of unique substrings
        for (int i = 0; i < 26; i++) {
            result[i] = totalSubstrings - charCount[i] + 1;
        }

        return result;
    }
}
