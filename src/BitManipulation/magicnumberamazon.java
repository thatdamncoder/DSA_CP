package BitManipulation;

public class magicnumberamazon {
    public static void main(String[] args) {
        System.out.println(magic(6));
    }
    static int magic(int n){
        /*
        first magic number is
        1- 0   0   1
          5p2 5p1 5p0
       => 5p2*0 + 5p1*0 + 5p0*1 = 5
       i.e, 1st magic number is 5

       generalised-
          if nth magic number
          write n in binary
          multiply each bit in power of 5
          add all
          return
         */
        int i=1;
        int sum=0;
        while(n>0){
            sum+=(n&1) * (int)Math.pow(5,i);
            n=n>>1;
            i++;
        }
        return sum;
    }
}
