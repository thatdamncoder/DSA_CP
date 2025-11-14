package CodeChef;

import java.util.Scanner;

public class OperatingonA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            long[] b=new long[n];
            for (int i = 0; i < n; i++) arr[i]=sc.nextLong();
            for (int i = 0; i < n; i++) b[i]=sc.nextLong();

            for (int i = 0; i+3< n; i++) {
                if(arr[i]!=b[i]){
                    long a1=arr[i];
                    long a2=arr[i+1];
                    long a3=arr[i+2];
                    long a4=arr[i+3];
                    arr[i]=a1+a2+a3;
                    arr[i+1]=-a3;
                    arr[i+2]=-a2;
                    arr[i+3]=a4+a3+a2;
                }
            }
            boolean ok=true;
            for (int i = 0; i < n && ok; i++) {
                if(arr[i]!=b[i]) ok=false;
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
