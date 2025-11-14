package CodeForces;

import java.util.Scanner;

public class PlusMinusSplit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n= sc.nextInt();
            String s=sc.next();
            int pos=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='+') pos++;
                else pos--;
            }
            pos=Math.abs(pos);
            System.out.println(pos);
        }
    }


    //dont think too much
    static int max;
    public static int solve(int start,int[] arr,int length){
        if(start>=arr.length) return 0;
//        int maxl=0;
//        for (int i = start+1; i < arr.length ; i++) {
//            int sum=Math.abs(arr[start])*length+solve(i,arr,length+1);
//            maxl=Math.max(maxl,sum);
//        }
//        max=Math.max(maxl,max);
        int maxl = Math.abs(arr[start]) * length + solve(start + 1, arr, length + 1);
        maxl = Math.max(maxl, solve(start + 1, arr, 0));
        return maxl;
    }

}
