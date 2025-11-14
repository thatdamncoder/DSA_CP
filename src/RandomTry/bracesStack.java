package RandomTry;

import java.util.Stack;

public class bracesStack {
    public static void main(String[] args) {
        System.out.println(correctBraces("({()})"));
    }
    static String correctBraces(String s){
        if(s.isEmpty()){
            return "false";
        }
        if(s.length()%2!=0){
            return "false";
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && stack.pop()!='('){
                return "false";
            }
            else if(s.charAt(i)=='}' && stack.pop()!='{'){
                return "false";
            }
            else if(s.charAt(i)==']' && stack.pop()!='['){
                return "false";
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return "true";

    }
}
