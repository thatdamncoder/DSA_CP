package RandomTry;

import java.util.ArrayList;
import java.util.List;

public class polynomialArray {
    public static void main(String[] args) {
//        int mask=0x000F;
//        int value=0x2222;
//        System.out.println(value & mask);
        List<int[]> list=new ArrayList<>();
        int[] add=new int[]{0,0};
        list.add(add);
        list.add(new int[] {2,3});
        list.add(new int[] {3,2});
        list.add(new int[] {-1,4});
        list.add(new int[] {4,-1});
        int[] pair=new int[]{-1,4};
        System.out.println(list.contains(pair));
    }
    public void getarrays(int degree){
        
    }
}
