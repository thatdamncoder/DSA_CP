package CodeForces;

import java.util.Scanner;

public class MinStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            String s=sc.next();
            char[] arr=s.toCharArray();
            for(int i=1;i<arr.length;i++){
                if(arr[i]==arr[i-1]) {
                    char change = (char) ('a' + ((arr[i] - 'a' + 1) % 25));
                    if (i + 1 < arr.length && arr[i + 1] == change) {
                        change = (char) ('a' + ((arr[i] - 'a' + 2) % 25));
                    }
                    arr[i]=change;
                }
            }
            System.out.println(new String(arr));
        }
    }
}
