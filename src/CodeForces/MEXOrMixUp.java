package CodeForces;

import java.util.Scanner;

public class MEXOrMixUp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int mex=sc.nextInt();
            int xor=sc.nextInt();
            if(mex==1) System.out.println(xor==1?3:2);
            else{
                int ac=0;
                for (int i = 0; i < mex; i++) {
                    ac^=i;
                }
                if(ac!=xor) System.out.println(mex+1);
                else System.out.println(mex);
            }
        }
    }
}
