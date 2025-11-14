package CodeForces;

import java.util.Scanner;

public class R916_Div3_A {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] ans=new int[n];
//        for(int i=0;i<n;i++){
//            int a=sc.nextInt();
//            String s=sc.next();
//            ans[i]=solve(a,s);
//        }
//        for (int i:ans) {
//            System.out.println(i);
//        }
        String s="011101";
        System.out.println(simulation(s));
    }

    private static int solve(int a,String s) {
        int count=0;
        int sum=0;
        for(int i=0;i<s.length();){
            while(i>0 && s.charAt(i)==s.charAt(i-1)) i++;
            sum+=s.charAt(i)-'A'+1;
            if(sum>=a) return count;
            count++;
            i++;
        }
        return count;
    }
    public static int simulation(String s) {
        int setbits=0;
        for(int i:s.toCharArray()){
            if(i=='1') setbits++;
        }
        int zeros=0;
        int ones=setbits;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<s.length()-1;j++){
            if(s.charAt(j)=='0') zeros+=1;
            if(s.charAt(j)=='1') ones-=1;
            max=Math.max(max,zeros+ones);
        }
        return max;
    }
}
