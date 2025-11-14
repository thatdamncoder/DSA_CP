package CodeForces;
import java.util.*;
public class MakeitUgly2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int result = minElementsToRemove(n, arr);
            System.out.println(result);
        }
    }

    public static int minElementsToRemove(int n, int[] arr) {
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] != arr[i + 1]) {
                count++;
            }
        }

        // Check if it's impossible to make the array non-beautiful
        if (count == 0) {
            return -1;
        } else {
            // At least one segment needs to be removed
            // The minimum number of elements to remove is count + 1
            // Because we can't remove the first or the last element of the array
            return count + 1;
        }
    }
}
