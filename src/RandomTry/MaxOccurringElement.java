package RandomTry;

public class MaxOccurringElement {
    public static int findMaxOccurringElement(int[] arr) {
        int n = arr.length;
        int candidate = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the candidate is the maximum occurring element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > n / 2) ? candidate : -1; // Return -1 if there is no majority element
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,2,5,2,2,5,2};
        int maxOccurringElement = findMaxOccurringElement(arr);
        System.out.println("Max Occurring Element: " + maxOccurringElement);
    }
}

