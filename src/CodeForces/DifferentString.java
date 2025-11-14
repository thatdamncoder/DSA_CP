package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class DifferentString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
//            Set<Character> set=new HashSet<>();
//            boolean ok=false;
//            for(char ch:s.toCharArray()) {
//                set.add(s);
//                if(set.size()>=2) {
//                    ok=true;
//                    break;
//                }
//            }
//            if(!ok) System.out.println("NO");
//            else {
                char[] arr = s.toCharArray();
                boolean ok=false;
                for (int i = 1; i < s.length(); i++) {
                    if (arr[i] != arr[0]) {
                        char temp = arr[0];
                        arr[0] = arr[i];
                        arr[i] = temp;
                        ok=true;
                        break;
                    }
                }
                if(!ok) System.out.println("NO");
                else{
                    System.out.println("YES");
                    System.out.println(new String(arr));
                }

//            }
        }
    }
}
