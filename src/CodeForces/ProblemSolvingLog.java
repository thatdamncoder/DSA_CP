package CodeForces;

import java.util.Scanner;

public class ProblemSolvingLog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int solved=0;
            int[] count=new int[26];
            for(int i=0;i<26;i++){
                count[i]=i+1;
            }

            for(int i=0;i<n;i++){
                count[s.charAt(i)-'A']--;
            }
            for(int i=0;i<26;i++){
                if(count[i]<=0) solved++;
            }
            System.out.println(solved);
        }
    }
}
