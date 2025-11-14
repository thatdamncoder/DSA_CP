package StacksandQueues;
import java.util.Stack;

public class Leetcode_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(valid("[[[]"));
    }
    static boolean valid(String s){
        if(s.isEmpty()){
            return true;
        }
        if(s.length() % 2!=0){
            return false;
        }
        Stack<Character> stack= new Stack<>();
        int flag=0;
        for(int i=0;i<s.length();i++){
            flag=0;
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            if(ch==')' && stack.pop()=='('){
                flag=1;
                continue;
            }
            if(ch=='}' && stack.pop()=='{'){
                flag=1;
                continue;
            }
            if(ch==']' && stack.pop()=='[') {
                flag=1;
                continue;
            }
            if(flag==0){
                return false;
            }

        }
        return flag==1;
    }

}
