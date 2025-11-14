package CodeForces;

import java.util.Scanner;

public class UnNaturalLangProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb=new StringBuilder();
            for(int j = n-1; j>=0;){
                if(isConst(s.charAt(j))){
                    String ap="."+s.charAt(j)+s.charAt(j-1)+s.charAt(j-2);
                    sb.append(ap);
                    j-=3;
                }else{
                    String ap="."+s.charAt(j)+s.charAt(j-1);
                    sb.append(ap);
                    j-=2;
                }
            }
            sb.deleteCharAt(0);
            System.out.println(sb.reverse());
            //will give tle
//            for(int i=sb.length()-1;i>0;i--){
//                System.out.print(sb.charAt(i));
//            }
//            System.out.println();
        }
    }
    static boolean isConst(char c){
        return ( c=='b' || c=='c' || c=='d');
    }
    static void givingtle(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n=sc.nextInt();
            String s=sc.next();
            int j=0;
            while(j<n){
                System.out.print(s.charAt(j));
                if(!isConst(s.charAt(j)))   {
                    if(j+1<n && isConst(s.charAt(j+1))){
                        if(j+2<n){
                            if(isConst(s.charAt(j+2))) {
                                System.out.print(s.charAt(j + 1));
                                j++;
                            }
                            System.out.print(".");
                        }
                    }
                }
                j++;
            }
            System.out.println();
        }
    }
}
