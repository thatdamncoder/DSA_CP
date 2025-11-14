package RandomTry;
/////////
public class tableInOneLine {
    public static void main(String[] args) {
        table(5,1);
    }
    static void table(int n, int i){
        int ans=(i<=10)?(n*i++):0;
        System.out.println(ans);
    }
}
