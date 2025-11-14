package CodeForces;

import java.util.Scanner;
import java.util.Spliterator;

public class MakeItWhite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            String s=sc.next();
            int start=-1;
            int end=-1;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='B' && start==-1 && end==-1){
                    start=i;
                    end=i;
                }
                if(s.charAt(i)=='B') end=i;
            }
            System.out.println(end-start+1);
        }

    }
}
