package CodeChef;

import java.util.Scanner;

public class FakeCertificate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int ones=0;
            int count=0;
            int max=0;
            for (int i = 0; i < n; i++) {
                char ch=s.charAt(i);
                if(ch=='0'){
                    count++;
                }
                else{
                    max=Math.max(max,count);
                    count=0;
                    ones++;
                }
            }
            max=Math.max(max,count);
            System.out.println(ones+max);
        }
    }
}
