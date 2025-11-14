package Maths;

public class sqrtofanumber {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(squareroot(n,p));
    }
    static float squareroot(int n,int precision){
        int start=0;
        int end=n;
        float ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid<n){
                start=mid+1;
            }
            else if(mid*mid>n){
                end=mid-1;
            }
            else{
                ans= (float)mid;
            }
        }
        //end==rounded off number if n is not a perfect square
        //if the number is not a perfect square

        if(ans*ans==n) return ans; //perfect square
        float increment=0.1f;
        for (int i = 0; i < precision; i++) {
            while(ans*ans<=n){
                ans+=increment;
            }
            ans-=increment;
            increment=increment/10;
        }

        return ans;
    }
}
