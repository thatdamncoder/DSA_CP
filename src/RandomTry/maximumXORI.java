package RandomTry;

import java.util.Arrays;

public class maximumXORI {
    public static void main(String[] args) {
//        int[] nums={3,49,81,95,92};
//        System.out.println(maxstrongpair(nums));
        String s="aBcdEF";
        char[] chararray=s.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            int asci=chararray[i]-'a';
            for (int j = 0; j < chararray.length; j++) {
                int ascj=chararray[j]-'a';
                if(asci<ascj){
                    char temp=chararray[i];
                    chararray[i]=chararray[j];
                    chararray[j]=temp;

                }
            }
        }
        System.out.println(String.valueOf(chararray));
    }
    static int maxstrongpair(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    System.out.println(nums[i]+ "+" + nums[j]);
                    System.out.println(nums[i]^nums[j]);
                    max=Math.max(max,nums[i]^nums[j]);
                }
            }


        }
        return max;
    }
}
