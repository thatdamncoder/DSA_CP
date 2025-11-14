package CodeForces;

import java.util.Scanner;

public class Recoveringasmallstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s="";
//            if(n<=26){
//                s+="aa";
//                s+=(char)('a' + n-2-1);
//                System.out.println(s);
//                continue;
//            }

            while(n>0){
                if(n-1<=26){
                    s+="a";
                    n-=1;

                }
                else if(n-2<=26){
                    s+="aa";
                    s+=(char)('a' + n-2-1);
                    break;
                }
                else if(n>26){
                    s="z"+s;
                    n-=26;
                }

            }

//            if(n-(3*26)>26){
//                s+="zzz";
//            }else if(n-(2*26)>26){
//                s+=(char)('a'+n-(2*26)-1);
//                s+="zz";
//            }else if(n-26>26) {
//                s += "a";
//                s += (char) ('a' + n - 26 - 2);
//                s += "z";
//            }else{
//                s+="aa";
//                s+=(char)('a' + n-2-1);
////                System.out.println(s);
//            }
            System.out.println(s);
        }
    }
}
