package CodeForces;

import java.util.Scanner;

public class GiftCarpet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String[] arr=new String[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.next();
            }
            char[] check={'v','i','k','a'};
            int index=0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[j].charAt(i)==check[index]) {
                        index++;
                        break;
                    }
                }
                if(index==4) break;
            }
            if(index>=4) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
