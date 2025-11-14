package RandomTry;

public class addBinary {
    public static void main(String[] args) {
        fibonacci(6);
        System.out.println(1.0/(6*100000));
    }
//    static String add(String a, String b) {
//        String ans="";
//        for(int i=0;i<=a.length();i++){
//            ans+="0";
//        }
//        for(int i=a.length()-1;i>=0;i--){
//            if(Integer.parseInt(a.charAt(i))==1 && Integer.parseInt(b.charAt(i))==1){
//                char c = ans.charAt(i - 1);
//                c=(char)Integer.parseInt(String.valueOf(c))+1;
//                continue;
//            }
//            Integer.parseInt(ans.charAt(i))+=Integer.parseInt(a.charAt(i)) + Integer.parseInt(b.charAt(i));
//        }
//        return ans;

//    }
    static int fibonacci(int n){
        double ans=1.0/n;
        System.out.println(ans);
        return 0;
    }

}
