package CodeForces;

import javax.swing.*;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class YetAnotherCoinProblem {
    static Integer[][] t=new Integer[2][6];

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr={1,3,6,10,15};
        while(num--!=0){
            int n=sc.nextInt();
//            System.out.println(rec(5,n,arr));
            int[] coins = {15, 10, 6, 3, 1}; // Available coin values
            int minCoins = 0;

            for (int coin : coins) {
                // Greedily select the largest possible coin that is less than or equal to n
                minCoins += n / coin;
                n %= coin;
                if(n==0) break;
            }

            System.out.println(minCoins);
        }
    }
    public static int rec(int i,int w,int[] arr){
        if(i==0) return (w==0)?0:Integer.MAX_VALUE-1;
        if(w<=0) return (w==0)?0:Integer.MAX_VALUE-1;

        if(t[w][i]!=null) return t[w][i];
        int take=Integer.MAX_VALUE;
        if(arr[i-1]<=w){
            if(take==Integer.MAX_VALUE) take=0;
            take=1+rec(i,w-arr[i-1],arr);
        }
        int leave=rec(i-1,w,arr);
        return t[w][i]=Math.min(take,leave);
    }
}
/*
14
1
2
3
5
7
11
12
14
16
17
18
20
98
402931328

 */