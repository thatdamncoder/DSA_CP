package CodeForces;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class _158A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int ele=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==k-1) ele=arr[i];
        }
        int ans=0;
        for (int i = n-1; i>=0;) {
            if(arr[i]==ele) {
                if (ele == 0) {
                    while (i >= 0 && arr[i] == 0) {
                        i--;
                    }
                    ans = i + 1;
                }
                else ans = i + 1;
                break;
            }
            i--;
        }
        System.out.println(ans);
    }

}
