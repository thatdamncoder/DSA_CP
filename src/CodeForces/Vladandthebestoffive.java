package CodeForces;

import java.util.Scanner;

public class Vladandthebestoffive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int[] count=new int[2];
            boolean f=false;
            for(char ch:s.toCharArray()){
                if(ch=='A') count[0]++;
                else count[1]++;
            }
            if(f) continue;
            if(count[0]>count[1]){
                System.out.println("A");
            }
            else if(count[1]>count[0]){
                System.out.println("B");
            }
        }
    }
}
