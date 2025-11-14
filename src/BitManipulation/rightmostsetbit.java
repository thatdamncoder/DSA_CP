package BitManipulation;

public class rightmostsetbit {
    public static void main(String[] args) {
        int n=10110000;
        System.out.println(rightmostset(n));
    }
    static int rightmostset(int n){
        int i=1;
        while(n!=1) {
            if((n&1)!=1){
                n=n>>1;
                i++;
            }else{
                return i;
            }
        }

        return i;
    }
}
