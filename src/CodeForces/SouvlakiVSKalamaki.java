package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SouvlakiVSKalamaki {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            boolean ok=true;
            for (int i = 0; i < n; i++) {
                if(i%2==1 && i+1<n){
                    if(arr[i]!=arr[i+1]){
                        ok=false;
                        break;
                    }
                }
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
