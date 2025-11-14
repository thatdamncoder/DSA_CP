package RandomTry;

import java.util.Arrays;
import java.util.List;

public class gameof2stacks {
    public static void main(String[] args) {

    }
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b){
        return twoStacks(maxSum,a,b,0,0)-1;
    }
    private static int twoStacks(int maxSum, List<Integer> a, List<Integer> b,int sum,int count) {
        if(sum>maxSum || a.isEmpty() || b.isEmpty()) {
            return count;
        }

        int counta=twoStacks(maxSum,a.subList(1,a.size()),b,sum+a.get(0),count+1);
        int countb=twoStacks(maxSum,a,b.subList(1,b.size()),sum+b.get(0),count+1);

        return Math.max(counta,countb);

    }
}
