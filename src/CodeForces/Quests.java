package CodeForces;

import java.util.Scanner;

public class Quests {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        while(num--!=0){
//            int n=sc.nextInt();
//            int k=sc.nextInt();
//            int[] arr=new int[2*n];
//            for(int i=0;i<arr.length;i+=2){
//                arr[i]=sc.nextInt();
//            }
//            for (int i = 1; i < arr.length; i+=2) {
//                arr[i]=sc.nextInt();
//            }
//            int sum=arr[0]+(k-1)*arr[1];
//            int max=sum;
//            int i=2;
//            int j=1;
//            for(int outer=1;outer<k && j<arr.length && i<arr.length;outer++){
//                for (int inner = 0; inner < k-outer; inner++) {
//                    if(arr[i]==0) i++;
//                    if(i>=arr.length) break;
//                    sum=sum-arr[j]+arr[i];
//                    max=Math.max(max,sum);
//                    if(i%2==0) arr[i]=0;
//                }
//                i++; j+=2;
//            }
//            System.out.println(max);
//        }
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            int[] cost=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextInt();
                arr[i]=sum;
            }
            int max=0;
            for (int i = 0; i < n; i++) {
                max=Math.max(max,sc.nextInt());
                cost[i]=max;
            }
            max=-1;
            for(int i=0;i<Math.min(n,k);i++){
                max=Math.max(max,arr[i]+(k-i-1)*cost[i]);
            }
            System.out.println(max);
        }
    }
}
