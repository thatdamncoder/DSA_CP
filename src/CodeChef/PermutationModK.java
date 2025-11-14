package CodeChef;

import java.util.Scanner;

public class PermutationModK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k==1) System.out.println(-1);
            else {
                int[] arr = new int[n];
                int lastone = -1;
                for (int i = 0; i < n; i++) {
                    if (i + 2 <= n) {
                        arr[i] = i + 2;
                        if ((i + 2) % k != 1) lastone = i;
                    }
                }
                boolean ok = true;
                if (n % k == 1) {
                    if (lastone == -1 || lastone == 0) {
                        ok = false;
                    } else {
                        int temp = arr[lastone];
                        arr[lastone] = 1;
                        arr[n - 1] = temp;
                    }
                } else {
                    arr[n - 1] = 1;
                }
                if (ok) {
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                } else System.out.println(-1);
            }
        }
    }
}
