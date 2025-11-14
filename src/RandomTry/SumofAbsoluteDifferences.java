package RandomTry;

import java.util.Arrays;

public class SumofAbsoluteDifferences {
    public static long sumOfAbsoluteDifferences(int[] arr) {
        // Step 1: Sort the array
        int sum = 0;
        int n=arr.length;
        for (int i = n - 1; i >= 0; i--)
            sum += i * arr[i] - (n - 1 - i) * arr[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,3};
        System.out.println(sumOfAbsoluteDifferences(arr)); // Output: 8
    }
}

