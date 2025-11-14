package BitManipulation;

import Trees.Pair;

public class numberofsetbits {
    public static void main(String[] args) {
        int n=10;
        System.out.println(Integer.toBinaryString(n));
        int count=0;
        while(n>0){
            n=(n&(n-1));
            count++;
        }
        System.out.println(count);
        //or
        int n1=10;
        count=0;
        while(n1!=0){
            count++;
            n1= n1 - (n1 & -n1);
        }
        System.out.println(count);
    }
}
