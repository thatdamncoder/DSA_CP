package CodeForces;

import java.util.Scanner;

public class SettingUpCamp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            long intro=sc.nextLong();
            long extro=sc.nextLong();
            long uni=sc.nextLong();
            long diff=3-(extro%3);
            diff=(diff==3)?0:diff;
            if(uni-diff<0) System.out.println(-1);
            else {
                long ans = intro + (extro + diff) / 3 + (long)Math.ceil((uni - diff)/3.0);
                System.out.println(ans);
            }
        }
    }
}
