package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SumdamentalDecomposition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            long sum=0;
            int[] count=new int[32];
            int ones=0;
            int nearestzero=0;
            for (int i = 31; i >=0; i--) {
                int b=(n>>i)&1;
                ones+=b;
                if(b==1) sum+=(1L<<i);
                else nearestzero=i;
                count[i]=b;
            }
//            System.out.println(Arrays.toString(count));
            int rem=x-ones;
//            System.out.println(sum + " " + ones + " " + rem);
//            rem=rem%2!=0?(rem+1):rem;
            for (int i = 0; i < 32 && rem>0; i++) {
                long c=(1L<<i);
                if(rem%2==0){
//                    System.out.println("rem%2==0");
//                    System.out.println(c*rem);
                    sum+=c*rem;
                    rem=0;
                    break;
                } else{
                    if(count[i]==1){
//                        System.out.println("rem%2!=0 && count[i]==1");
//                        System.out.println(c*(rem-1));
                        if(rem+1<x) {
                            sum+=c*(rem+1);
                            rem=0;
                            break;
                        } else {
                            sum+=c*(rem-1);
                            rem = 1;
                        }
                    } else if(rem+1<=x){
//                        System.out.println("rem%2!=0 && rem+1<=x");
//                        System.out.println(c*(rem+1));
                        sum+=c*(rem+1);
                        rem=0;
                        break;
                    } else{
//                        System.out.println("rem%2!=0 && else");
//                        System.out.println(c*(rem-1));
                        sum+=c*(rem-1);
                        rem=1;
                    }
                }
            }

            if(rem>0) sum=-1;
            System.out.println(sum);
        }
    }
}
