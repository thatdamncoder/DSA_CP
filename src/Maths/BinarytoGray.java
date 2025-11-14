package Maths;

public class BinarytoGray {
    public static int graytobinary(int n){
        if(n<=1) return n;
        int k=31;
        int ans=0;
        int prev=0;
        while(k>=0){
            int ele=(n>>k)&(1);
            if(k==31){
                ans=(ans)|(ele<<k);
                prev=ele;
            }
            else{
                int temp=ele^prev;
                prev=temp;
                ans=(ans)|(temp<<k);
            }
            k--;
        }
        return ans;
    }
    public static int binarytogray(int n){
        int k=0;
        int ans=0;
        int prev=0;
        while(n!=0){
            if(k==0) prev=n&1;
            else{
                int curr=n&1;
                int temp=curr^prev;
                prev=curr;
                ans|=temp<<k;
            }
            k++;
            n/=10;
        }
        ans|=prev;
        return ans;
    }
}
