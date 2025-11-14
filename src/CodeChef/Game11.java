package CodeChef;

import java.util.*;

public class Game11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int[] b=new int[m];
            for (int i = 0; i < m; i++) {
                b[i]=sc.nextInt();
            }
            if(n<4 || m<4 || n+m<11){
                System.out.println(-1);
                continue;
            }
            Arrays.sort(a);
            Arrays.sort(b);
            long sum=0;
            List<Integer> list=new ArrayList<>();
            for (int i = n-1; i >=0 ; i--) {
                if(i>=n-4) sum+=a[i];
                else list.add(a[i]);
            }
            for (int j = m-1; j >=0; j--) {
                if(j>=m-4) sum+=b[j];
                else list.add(b[j]);
            }
            Collections.sort(list);
            for (int k = list.size()-1; k>=0 && k>=list.size()-Math.min(3,list.size()) ; k--) {
                sum+=list.get(k);
            }
            System.out.println(sum);
        }
    }
}
