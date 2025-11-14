package BitManipulation;

public class ithbitofanumber {
    public static void main(String[] args) {
        int n=10110110;
        System.out.println(ithBit(n,4));
    }
    static int ithBit(int n,int i){
//        for (int j = 0; j < i; j++) {
//            n = n >> 1;
//        }
//        return n&1;

        //OR
        int shift=1;
        for (int j = 0; j < i; j++) {
            shift=shift<<1;
        }
        return n&shift;
    }
}
