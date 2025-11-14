package CP31;

import java.util.Scanner;
/*
you can always rearrange the elements any number of times if k>=2, since minimum 2 is
required- bubble sort
this is the only catch- because it says any number of times rearrangement is possible
 */
public class _800HalloumiBoxes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            if(k>=2) System.out.println("YES");
            else{
                int count=0;
                boolean ok=true;
                for (int i = 0; i < n-1; i++) {
                    if(arr[i]>arr[i+1]) count++;
                    if(count>=k){
                        System.out.println("NO");
                        ok=false;
                        break;
                    }
                }
                if(ok) System.out.println("YES");
            }
        }
    }
}
