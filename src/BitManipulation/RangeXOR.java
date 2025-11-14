package BitManipulation;

public class RangeXOR {
    public static void main(String[] args) {
        int a=4;
        int b=16;
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);

        //for verifying
        int check=0;
        for (int i = a; i <=b ; i++) {
            check^=i;
        }
        System.out.println(check);
    }
    //gives xor of all numbers from 0 till a (both inclusive)
    static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        if(a%4==3){
            return 0;
        }
        return 0;
    }
}
