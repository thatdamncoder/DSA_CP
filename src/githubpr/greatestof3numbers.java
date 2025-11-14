package githubpr;

public class greatestof3numbers {
    public static void main(String[] args) {
        int a=23,b=45,c=47;
        System.out.println(greatestusingMax(a,b,c));
        System.out.println(greatestUsingConditionals(a,b,c));
    }
    static int greatestusingMax(int a, int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    static int greatestUsingConditionals(int a,int b,int c){
        return (a>b)?(a>c?a:c):(b>c?b:c);
    }
}
