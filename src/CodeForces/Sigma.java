package CodeForces;

import java.util.*;
import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[][] arr = new long[n][m];

            // Input the arrays
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) arr[i][j] = sc.nextLong();
            }

            // List to store sum and index
            List<long[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += arr[i][j];
                }
                list.add(new long[]{sum, i}); // Store sum and index
            }

            // Sort by sum in descending order
            Collections.sort(list, (a, b) -> Long.compare(b[0], a[0]));

            long ans = 0;
            long pre = 0;

            // Calculate the maximum score
            for (long[] l : list) {
                pre += l[0];
                ans += pre;
            }

            System.out.println(ans);
        }
    }
}
