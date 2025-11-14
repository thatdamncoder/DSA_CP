package Maths;

public class NearestGreaterPrime {
    public static void main(String[] args) {
        if(!computed) seive();
        System.out.println(linearsearch(20));
    }
    static boolean[] notprime=new boolean[100001];
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
    private static int linearsearch(int target){
        for (int i = target+1; i <2*target ; i++) {
            if(!notprime[i]) return i-target;
        }
        return 0;
    }
    private static int binarysearch(int target){
        int start=target+1;
        int end=2*target;
        int ans=0;
        while(start<end){
            System.out.println("hello");
            int mid=start+(end-start)/2;
            System.out.println(start + " " + mid + " " + end) ;
            if(!notprime[mid]) {
                ans=Math.min(ans,mid-target);
                end=mid;
//                return mid;
            }
            else start=mid+1;
        }
        return ans;
    }

}
