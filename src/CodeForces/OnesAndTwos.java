package CodeForces;

import java.util.Scanner;

public class OnesAndTwos{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int two=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]==2) two++;
            }
            if(two==0 || two%2!=0){
                System.out.println((two==0)?1:-1);
                continue;
            }
            two/=2;
            for (int i = 0; i < n; i++) {
                if(arr[i]==2){
                    two--;
                }
                if(two==0) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
