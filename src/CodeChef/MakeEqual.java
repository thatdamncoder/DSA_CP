package CodeChef;

import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean ok=true;
            for (int i = 0; i+2 <n && ok ; i++) {
                if(arr[i+1]>=arr[i] && arr[i+1]>=arr[i+2]) {
                    int min=Math.min(arr[i],arr[i+2]);
                    if(min!=arr[i]) ok=false;
//                    else if(arr[i]!=arr[i+2]) arr[i+1]=Math.max(arr[i],arr[i+2])-1;
//                    else if(arr[i]==arr[i+2])
                    else arr[i+1]=arr[i];
                }
                else ok=false;
            }

            int ele=arr[0];
            for (int i = 0; i +1<n && ok ; i++) {
                if(arr[i]!=ele) ok=false;
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
