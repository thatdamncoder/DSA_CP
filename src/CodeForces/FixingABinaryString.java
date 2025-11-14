package CodeForces;

import java.util.Scanner;

public class FixingABinaryString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int ans=solve(s,k);

            System.out.println(ans);
        }
    }
    public static int solve(String s,int k){
        int n=s.length();
        int count=0;
        char ele=s.charAt(n-1);
        boolean m=false;
        int missing=0;
        char mele='$';
        for (int i = n-1; i >=0 ; ){
            char ch=s.charAt(i);
            if(count>k){
                while(i>=0 && s.charAt(i)==ele){
                    count++;
                    i--;
                }
                if(i<0){
                    return -1;
                }
                if(count-k==missing && mele==ele){
                    return i;
                }
                else{
                    return -1;
                }
            }
            if(ch!=ele){
                if(count<k && !m){
                    missing=k-count;
                    mele=ele;
                    ele=ch;
                    count=1;
                    m=true;
                }
                else if(count<k && m){
                    if(count==missing && mele==ele){
                        return i;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    count=1;
                    ele=ch;
                }
            }
            else count++;
            i--;
        }
        System.out.println(count);
        System.out.println(missing);
        System.out.println(mele);
        if(count>k) return -1;
        else if(count<k){
            if(count==missing && mele==ele){
                return count-1;
            }
        }
        return n;
    }
}
