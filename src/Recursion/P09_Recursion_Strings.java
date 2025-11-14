package Recursion;

//CONCEPT- Substrings create new objects since strings are immutable


public class P09_Recursion_Strings {
    public static void main(String[] args) {
        String s="bacappisgoodapple";
        System.out.println(skipAppnotApple(s));
    }
    static String skipaChar(String str,String ans){
        if(str.isEmpty()){
            return ans;
        }
        if(str.charAt(0)!='a'){
            ans=ans+ String.valueOf(str.charAt(0));
        }
        return skipaChar(str.substring(1),ans);

    }
    static String skipaCharwithoutArg(String str){
        String ans="";
        if(str.isEmpty()){
            return ans;
        }
        if(str.charAt(0)!='a'){
            ans=ans+ String.valueOf(str.charAt(0));
        }

        //for another method- use index arguement in the function call, increment the index by 1 in every call,
        //after checking if str.charAt(index)!='a'

        //String allAnsBefore=skipaCharwithoutArg(str,index+1);
        //return ans.concat(allAnsBefore);

        return ans+skipaCharwithoutArg(str.substring(1));
    }
    static String skipApple(String str){     //FirstTimeStuck(FTS)
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        return str.charAt(0)+skipApple(str.substring(1));
    }
    static String skipAppnotApple(String str){     //FirstTimeStuck(FTS)
        //Example :- if s=bacappisgoodapple, answer will be- bacisgoodapple
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppnotApple(str.substring(3));
        }
        return str.charAt(0)+skipAppnotApple(str.substring(1));
    }

}
