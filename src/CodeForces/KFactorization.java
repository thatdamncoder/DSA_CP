package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KFactorization {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            List<Integer> list=getPrimeFactors(n);
            if(list.size()<k) System.out.println(-1);
            else{
                long rem=1;
                for(int i:list){
                    if(k>1){
                        System.out.print(i + " ");
                        k--;
                    }
                    else rem*=i;
                }
                if(rem!=1) System.out.print(rem);
                System.out.println();
            }
        }
    }

    private static List<Integer> getPrimeFactors(int n) {
        List<Integer> list=new ArrayList<>();
        while(n%2==0){
            list.add(2);
            n/=2;
        }
        for (int i = 3; i*i<=n ; i+=2) {
            while(n%i==0){
                list.add(i);
                n/=i;
            }
        }
        if(n>2) {
            list.add(n);
        }
        return list;
    }
}
