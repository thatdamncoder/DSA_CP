package CodeForces;

import java.util.Scanner;

public class Wegoteverythingcovered {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String as="";
            String ds="";
            for(int i=0;i<k;i++){
                as=as+(char)('a'+i);
                ds=(char)('a'+i)+ds;

            }
            String ans="";
            for (int i = 0; i < n; i++) {
                if(i%2==0) ans+=as;
                else ans+=ds;
            }
            System.out.println(ans);
        }
    }
}
