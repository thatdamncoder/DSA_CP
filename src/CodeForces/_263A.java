package CodeForces;


import java.util.Scanner;

public class _263A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int i=0,j=0,x=-1,y=-1;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                n=sc.nextInt();
                if(n==1){
                    x=i; y=j;
                    break;
                }
            }
        }
        System.out.println(Math.abs(x-2)+Math.abs(y-2));
    }
}
