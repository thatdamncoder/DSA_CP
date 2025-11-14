package CodeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlienOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            List<String> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s=sc.next();
                list.add(s);
            }
            char[] arr=new char[k];
            Arrays.fill(arr, '0');
            boolean ok=true;
            for (int i = k-1; i>=0 && ok; i--) {
                arr[i]='1';
                String s=new String(arr);
                if(!list.contains(s)) ok=false;
                arr[i]='0';
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}
