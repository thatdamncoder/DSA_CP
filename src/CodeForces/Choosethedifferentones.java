package CodeForces;

import Trees.Pair;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Choosethedifferentones {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k= sc.nextInt();
            Set<Integer> set1=new HashSet<>();
            Set<Integer> set2=new HashSet<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if(a<=k) set1.add(a);
            }
            for (int i = 0; i < m; i++) {
                int a=sc.nextInt();
                if(a<=k) set2.add(a);
            }
//            k=k/2;
            if(n<k/2 || m<k/2) {
                System.out.println("NO");
                continue;
            }

            int[] count=new int[k+1];
            int mk=k/2;
            int nk=k/2;
            for(int i:set1){
                count[i]++;
                mk--;
            }
            for(int i:set2){
                count[i]++;
                nk--;
            }
            if(mk>0 || nk>0){
                System.out.println("NO");
                continue;
            }
            boolean ok=true;
            for (int i = 1; i <=k ; i++) {
                if(count[i]==0) {
                    System.out.println("NO");
                    ok=false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
//            for (int i = 1; i <=k; i++) {
//                if(set1.contains(i)) {
//                    mk--;
//                }
//                else if(set2.contains(i)) nk--;
//            }
//            System.out.println(mk+ " " + nk);
//            if(mk>=0 && nk==0) System.out.println("YES");
//            else System.out.println("NO");
        }
    }
}
