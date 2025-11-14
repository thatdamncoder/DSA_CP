package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseShoeOnOtherHoof {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            Set<Integer> set=new HashSet<>();
            for (int i = 0; i < 4; i++) {
                set.add(sc.nextInt());
            }
            System.out.println(4-set.size());
        }
    }
}
