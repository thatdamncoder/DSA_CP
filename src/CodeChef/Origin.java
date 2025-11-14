package CodeChef;

import java.math.BigInteger;
import java.util.Scanner;

public class Origin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            BigInteger n = sc.nextBigInteger();
            BigInteger div = n.divide(BigInteger.valueOf(9));
            BigInteger p1 = div.multiply(BigInteger.valueOf(45));
            BigInteger rem = n.mod(BigInteger.valueOf(9));
            BigInteger p2 = rem.multiply(rem.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
            BigInteger ans = p1.add(p2);
            System.out.println(ans);

        }
    }
}
