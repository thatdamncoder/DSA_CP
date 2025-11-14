package CodeChef;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TraingularSwaps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i+3<=n;i++){
                Set<Character> set=new HashSet<>();
                for(int j=i;j<i+3 && j<n;j++) {
                    if(j<n) set.add(s.charAt(j));
                }
                if(set.size()>1) count++;
            }
            System.out.println(count);
        }
    }
}
