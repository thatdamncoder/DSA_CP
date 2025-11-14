package BitManipulation;

public class noOfDigitsInAnyBase {
    public static void main(String[] args) {
        int n=15;
        int b=2;
        int ans=(int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }

}
