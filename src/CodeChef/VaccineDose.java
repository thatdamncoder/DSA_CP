package CodeChef;

import java.util.Scanner;

public class VaccineDose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int d=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(d<l) System.out.println("Too Early");
            else if(d>r) System.out.println("Too Late");
            else System.out.println("Take second dose now");
        }
    }
}
