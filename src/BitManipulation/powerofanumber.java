package BitManipulation;

public class powerofanumber {
    public static void main(String[] args) {
        int base=2;
        int power=10;
        int ans=1;
        //time O(log(power))
        while(power!=0){
            if((power&1)==1){
                ans=ans*base;
            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
    }
}
