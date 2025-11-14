package CodeForces;

import java.util.*;

public class Followthestrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int[] count=new int[26];
//            Arrays.fill(count,-1);
//            String s="";
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 26; j++) {
                    if(count[j]==arr[i]){
                        sb.append((char)('a'+j));
                        count[j]++;
                        break;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
