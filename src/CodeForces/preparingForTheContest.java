package CodeForces;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class preparingForTheContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            for (int i = n - k; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = n - k + 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
