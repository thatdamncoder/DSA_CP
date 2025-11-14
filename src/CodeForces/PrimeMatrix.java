package CodeForces;

import java.util.Scanner;

public class PrimeMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        if(!computed) seive();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int[] count=new int[m];
            int ans=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int currans=0;
                for (int j = 0; j < m; j++) {
                    if(notprime[arr[i][j]]){
                        int diff=linearsearch(arr[i][j]);
                        count[j]+=diff;
                        currans+=diff;
                    }
                }
                if(currans==0){
                    ans=0;
                    break;
                }
                ans=Math.min(ans,currans);
            }
            for (int i = 0; i < m; i++) {
                ans=Math.min(ans,count[i]);
            }
            System.out.println(ans);
        }
    }
    private static int linearsearch(int target){
        for (int i = target+1; i <=2*target ; i++) {
            if(!notprime[i]) return i-target;
        }
        return 0;
    }
    private static int binarysearch(int target){
        int start=target+1;
        int end=100000;
        int ans=Integer.MAX_VALUE;
        while(start<end){
            int mid=start+(end-start)/2;
            if(!notprime[mid]) {
                ans=Math.min(ans,mid-target);
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    static boolean[] notprime=new boolean[1000001];
    static boolean computed=false;
    private static void seive(){
        computed=true;
        notprime[0]=true;
        notprime[1]=true;
        int n=100000;
        for (int i = 2; i*i <= n; i++) {
            if(!notprime[i]){
                for (int j = i*i; j <=n ; j+=i) {
                    notprime[j]=true;
                }
            }
        }
    }
}
/*
        20 53 6 97 74 12 92 48 13 97
        96 47 32 75 21 69 75 95 54 1
        97 36 1 41 87 1 23 39 44 27
        97 73 1 1 26 6 3 48 69 5
        70 93 42 35 5 12 22 33 29 13
        96 8 13 69 40 91 5 19 16 33
        61 92 54 82 60 24 63 64 59 65
        76 44 60 37 29 16 50 74 59 59
        77 58 95 30 52 25 34 2 49 920 2

        9 1
        20
        96
        97
        97
        70
        96
        61
        76
        77


 */