package CodeChef;

import java.util.Scanner;

public class ABCConjecture3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s= sc.next();
            boolean founda=false;
            int starta=0;
            int i=0;
            while(i<n && s.charAt(i)!='a') i++;
            if(i<n && s.charAt(i)=='a'){
                founda=true;
            }
            while(i<n && founda && s.charAt(i)!='b') i++;
            if(i<n && s.charAt(i)=='b') starta=i;

            boolean foundc=false;
            int startc=0;
            i=n-1;
            while(i>=0 && s.charAt(i)!='c') i--;
            if(i>=0 && s.charAt(i)=='c'){
                foundc=true;
            }
            while(i>=0 && foundc && s.charAt(i)!='b') i--;
            if(i>=0 && s.charAt(i)=='b') startc=i;

            if(startc<starta) System.out.println(0);
            else{
                int counta=0;
                for (int j = starta+1; j < n; j++) {
                    counta+=(s.charAt(j)=='c')?1:0;
                }
                int countc=0;
                for (int j = startc-1; j>=0; j--) {
                    countc+=(s.charAt(j)=='a')?1:0;
                }
                System.out.println(Math.min(counta,countc));
            }
        }
    }
}
