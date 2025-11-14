package RandomTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class octalnumbers {
    public static void main(String[] args) {
        String[] arr={"10","01"};
//        System.out.println(findDifferentBinaryString(arr));
//        printAllBinaryInRange("",5);
        System.out.println(convertToEqNumber(arr));

    }
    static String findDifferentBinaryString(String[] nums) {
        int x = 0;
        List<String> arrlist= Arrays.asList(nums);
        int limit=(int)(Math.pow(2,nums.length));
        int n=nums.length;
        for (int i = 0; i < limit ; i++) {
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(x)).replace(' ', '0');
            if(!arrlist.contains(binaryString)) {
                return binaryString;
            }
            x++;
        }
        return "";
    }
    static void printAllBinaryInRange(String p,int limit){
        if(p.length()==limit){
            System.out.println(p);
            return;
        }
        printAllBinaryInRange(p+"0",limit);
        printAllBinaryInRange(p+"1",limit);
    }
    static String convertToEqNumber(String[] nums){
        List<Integer> list=new ArrayList<>();
        int limit=(int)(Math.pow(2,nums.length));
        for (int i = 0; i < nums.length ; i++) {
            list.add(Integer.parseInt(nums[i]));
        }
        System.out.println(list);
        for (int i = 0; i < nums.length+1 ; i++) {
            if(!list.contains(i)){
                return Integer.toBinaryString(i);
            }
        }
        return "";
    }
}
