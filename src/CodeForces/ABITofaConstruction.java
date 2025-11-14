package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABITofaConstruction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n==1){
                System.out.println(k);
                continue;
            }
            List<Integer> list=new ArrayList<>();
            int ans=1;
            int sum=ans;
            while(k-sum>=0){
                sum+=ans;
                k-=sum;
                ans<<=1;
            }
            list.add(sum);
            for (int i = 0; i < n-2; i++) {
                list.add(0);
            }
            for(int i:list) System.out.print(i + " ");
            System.out.println();

        }
    }
}
