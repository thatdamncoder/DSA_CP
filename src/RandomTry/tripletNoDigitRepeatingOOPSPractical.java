package RandomTry;

public class tripletNoDigitRepeatingOOPSPractical {
    public static void main(String[] args) {
        triplet();
    }
    public static void triplet(){
        for(int i=100;i<=333;i++){
            int n=i;
            int n2=2*i;
            int n3=3*i;
            if(isSame(n) || isSame(n2) || isSame(n3)) continue;

            boolean terminate=false;
            while(n!=0 && !terminate){
                int a=n%10;
                n2=2*i;
                while(n2!=0 && !terminate){
                    int b=n2%10;
                    if(a==b) terminate=true;
                    n3=3*i;
                    while(n3!=0 && !terminate){
                        int c=n3%10;
                        if(b==c || a==c){
                            terminate=true;
                        }
                        n3=n3/10;
                    }
                    n2=n2/10;
                }
                n=n/10;
            }
            if(!terminate) System.out.println(i + " " + 2*i + " " + 3*i);
        }
    }

    public static boolean isSame(int n) {
        int a = n % 10;
        n = n / 10;
        int b = n % 10;
        n = n / 10;
        int c = n % 10;

        return (a == b || a == c || b == c || a == 0 || b == 0 || c == 0);
    }


}
