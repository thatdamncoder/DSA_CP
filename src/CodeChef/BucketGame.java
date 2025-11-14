package CodeChef;

import java.util.Scanner;

public class BucketGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int odd=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0) odd++;
            }
            if(odd==n || odd%2!=0) System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}
