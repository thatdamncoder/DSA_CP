package RandomTry;

import StacksandQueues.P05_Queue_CircularQueue;

public class stringToNum {
    public static void main(String[] args) {
    }
    static int toNum(String p){
        char[] chArr=p.toCharArray();
        int ans=0;
        for (int i = chArr.length-1; i>=0; i--) {
            int n=chArr[chArr.length-1-i]-'0';
            int tens=(int)Math.pow(10,i);
            ans=ans+n*tens;
        }
        return ans;
    }
}
