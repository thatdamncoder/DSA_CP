package CodeForces;

import java.util.Scanner;

public class BinaryCut {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            long ans=1;
            int n=s.length();
            boolean found=false;
            for (int i = 1; i < n; i++) {
                if(!found && s.charAt(i)=='1' && s.charAt(i-1)=='0') {
                    found=true;
                }
                else if(s.charAt(i)!=s.charAt(i-1)) ans++;
            }
            System.out.println(ans==0?1:ans);
//            for (int i = 0; i < n; ) {
//                char ch=s.charAt(i);
//                if(ch=='1') {
//                    while (i < n && s.charAt(i) == '1') {
//                        i++;
//                    }
//                    ans++;
//                }
//                else{
//                    while(i<n && s.charAt(i)=='0') i++;
//                    while(i<n && s.charAt(i)=='1') i++;
//                    ans++;
//                }
//            }
//            System.out.println(ans);
        }
    }
}
