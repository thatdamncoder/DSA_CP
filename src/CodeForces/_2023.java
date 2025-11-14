package CodeForces;

import java.util.Scanner;

public class _2023 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            long pr=1;
            for (int i = 0; i < n; i++) {
                pr*=sc.nextInt();
            }
            if(2023%pr!=0) System.out.print("NO");
            else{
                System.out.println("YES");
                for (int i = 0; i < k; i++) {
                    if(i==0) System.out.print((long)(2023/pr) + " ");
                    else System.out.print(1+ " ");
                }
            }
            System.out.println();
        }
    }
}
