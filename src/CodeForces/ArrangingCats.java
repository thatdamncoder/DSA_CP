package CodeForces;

import java.util.*;

public class ArrangingCats {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> set=new ArrayList<>();

        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            String t=sc.next();
            int count=0;
            int a=0;
            int b=0;
            for (int i = 0; i < n; i++) {
                char c=s.charAt(i);
                char d=t.charAt(i);
                if(c=='0' && d=='0') continue;
                if(d=='0' && c=='1') a++;
            }
            for (int i = 0; i < n; i++) {
                char c=s.charAt(i);
                char d=t.charAt(i);
                if(d=='1' && c=='0'){
                    if(a>0) a--;
                    count++;
                }
            }
            System.out.println(count+a);
//            for (int i = 0; i < n; i++) {
////                if(s.charAt(i)!=t.charAt(i)) count++;
//                if(s.charAt(i)=='1') a++;
//                if(s.charAt(i)=='1' && t.charAt(i)=='1') a--;
////                if(t.charAt(i)=='1') b++;
//            }
//            if(a==n) {
//                System.out.println(0);
//                continue;
//            }
////            if(a==0) System.out.println(b);
////            else System.out.println(Math.min(a,count));
//            for (int i = 0; i < n; i++) {
//                if(t.charAt(i)=='1' && s.charAt(i)=='0') {
//                    if(a>0)a--;
//                    count++;
//                }
//
//            }
//            System.out.println(a+count);
        }
    }
}
