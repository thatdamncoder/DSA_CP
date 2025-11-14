package CodeChef;

import java.util.Scanner;

public class FootballTraining {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int x= sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x>y?"FREEKICK":"PENALTY");
        }
    }
}
