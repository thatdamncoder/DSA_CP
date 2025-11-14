package CodeForces;

import java.util.Scanner;

public class GroupingIncreases {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int sl=Integer.MAX_VALUE; //last element of array 's'
            int tl=Integer.MAX_VALUE; //last element of array 't'
            int penalty=0;
            for (int i = 0; i < n; i++) {
                if(sl>tl){
                    int temp=sl;
                    sl=tl;
                    tl=temp;
                }
                int ele=sc.nextInt();
                if(ele<=sl) sl=ele;
                else if(ele<=tl) tl=ele;
                else{
                    sl=ele;
                    penalty++;
                }
            }
            System.out.println(penalty);
        }
    }
}
