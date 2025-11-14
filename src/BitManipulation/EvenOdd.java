package BitManipulation;

import Sorting.Insertion;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        int n=3524724;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
        //since only last digit (LSB) is determining if it even or odd

    }
}
