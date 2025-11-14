package CodeForces;

import java.util.Scanner;

public class FormingTraingles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
//            int[] prefix=new int[n+1];
            int[] count=new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                count[arr[i]]++;
//                if(i>0)prefix[i]=prefix[i-1]+count[i-1];
//                else prefix[i]=count[i];
            }
            long ans=0;
            int smaller=0;
            for (int i = 0; i <=n; i++) {
//                int pr=(i>0)?prefix[i]:0;
                ans+=((long) count[i] *(count[i]-1)*(count[i]-2))/6;
                ans+=(long) count[i] *(count[i]-1)/2 * smaller;
                smaller+=count[i];
            }
            System.out.println(ans);
        }
    }
}
