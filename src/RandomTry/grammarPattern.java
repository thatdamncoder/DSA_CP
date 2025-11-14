package RandomTry;

/*
THUE MORSE CODE
01
0110
01101001

each row has the previous row and the complement of it
 */
public class grammarPattern {
    public static void main(String[] args) {
        String s="0";
        patternlc(s,89,90);
        int i= Integer.parseInt(String.valueOf("0")) + 7;
        System.out.println(i);

//        String s=sequence(89);
//        System.out.println(s.charAt(90));
        //row and col both starting from 1
    }
    static void patternlc(String s,int row,int col){
        if(s.length()>=col) {
            System.out.println(s.charAt(col-1));
            return ;
        }

        s=s+complement(s);
        patternlc(s,row,col);
//        col=(col%2==0)?col/2: Math.ceilDiv(col,2);
//        System.out.println(s.charAt(col-1));
    }
    static void pattern(int n,String s,int row,int col){
        if(n==row) {
//            System.out.println(s);
//            System.out.println(s.charAt(col-1));
            return ;
        }

        s=s+complement(s);
        pattern(n+1,s,row,col);
//        col=(col%2==0)?col/2: Math.ceilDiv(col,2);
//        System.out.println(s.charAt(col-1));
    }
    static String complement(String s){
        s=s.replace("0","2");
        s=s.replace("1","0");
        s=s.replace("2","1");
        return s;
    }
    static String thueMorse(int n) {
        if (n == 1) {
            return "0";
        }

        String prev = thueMorse(n - 1);
        StringBuilder sb = new StringBuilder();

        for (char c : prev.toCharArray()) {
            if (c == '0') {
                sb.append("01");
            } else {
                sb.append("10");
            }
        }
        return sb.toString();
    }
    static String sequence(int steps) {
        StringBuilder sb1 = new StringBuilder("0");
        StringBuilder sb2 = new StringBuilder("1");
        for (int i = 0; i < steps; i++) {
            String tmp = sb1.toString();
            sb1.append(sb2);
            sb2.append(tmp);
        }
        return sb1.toString();
    }
}
