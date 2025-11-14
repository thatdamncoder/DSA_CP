package RandomTry;

public class VowelPermutationsLCHARD {
    public static long count=0;
    public static void main(String[] args) {
        int n=2;
        subsets(n,"","aeiou");
        System.out.println((int)(count % (1000000007)));
    }

    static void subsets(int n,String p,String up){
        // if(p.length()>n || ){
        //     count(p);
        //     return;
        // }
        if(up.isEmpty()){
            if(p.length()==n) {
                System.out.print(p+" ");
                count(p);
            }

            return;
        }
        subsets(n,p+up.charAt(0),up.substring(1));
        subsets(n,p,up.substring(1));
    }
    static void count(String s){
        if(s.length()==1){
            count+=s.length();
            return;
        }
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(i!=s.length()-1){
                switch(ch){
                    case 'a': if(s.charAt(i+1)=='e')  count+=1; break;
                    case 'e': if((s.charAt(i+1)=='a' || s.charAt(i+1)=='i'))  count+=1; break;
                    case 'i': if(s.charAt(i+1)!='i')  count+=1; break;
                    case 'o': if((s.charAt(i+1)=='i' || s.charAt(i+1)=='u'))  count+=1; break;
                    case 'u': if(s.charAt(i+1)=='a')  count+=1; break;
                    default : break;

                }
            }
            i++;
        }
    }
    static void count2(String s){
        int i=1;
        boolean correct=false;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(
                    i!=s.length()-1 && (s.charAt(i+1)=='e' && (s.charAt(i+1)=='a' || s.charAt(i+1)=='i') ||
                            s.charAt(i+1)!='i' || (s.charAt(i+1)=='i' || s.charAt(i+1)=='u') || s.charAt(i+1)=='a' )
            ){
                correct=true;
            }
            i++;
        }
        count+=1;
    }
}
