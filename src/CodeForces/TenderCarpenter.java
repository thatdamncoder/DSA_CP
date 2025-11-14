package CodeForces;

import java.util.Scanner;
import java.util.Set;

public class TenderCarpenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean ok=false;
            for(int i=0;i+1<n;i++){
                int a=arr[i]; int b=arr[i+1];
                if(a+a>(long)b && (long)b+b>(long)a){
                    ok=true;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}