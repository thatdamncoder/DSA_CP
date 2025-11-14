package RandomTry;

public class happynumberrecursion {
    public static void main(String[] args) {
        System.out.println(happynumber(236));
    }
    static int happynumber(int n){
        if(n==1){
            System.out.println("true");
            return 1;
        }
        int sum=0;
        while(n!=0){
            sum = sum + (int)Math.pow(n%10,2);
            n=n/10;
        }
        return happynumber(sum);
//        return -1;
    }
    static int countDigits(int n){
        return (int)Math.floor(Math.log10(n)+1);
    }
    static int replaceWithSumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum = sum + (int)Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
}
