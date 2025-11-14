package RandomTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        List<Character> list= new ArrayList<>();
        String s="k+l-m*n+(o^p)*w/u/v*t+q";
        int i=3;
        char ch= (char) ('a'+i);
        System.out.println(ch);
        System.out.println(topostfix(s,stack,list));
        System.out.println("97".compareTo("34"));

    }
    static List<Character> topostfix(String s, Stack<Character> stack, List<Character> list){
        if(s.isEmpty() ){
            while(!stack.isEmpty()) {
                if(checkoperator(stack.peek())!=3 && checkoperator(stack.peek())!=4) list.add(stack.pop());
            }
            return list;
        }
        char ch=s.charAt(0);
        int precedence= checkoperator(ch);
        if(precedence>=0){
            if(stack.isEmpty() ||  checkoperator(stack.peek())==3){
                stack.push(ch);
            }
            else{
                if(precedence > checkoperator(stack.peek())){
                    stack.push(ch);
                }
                else{
                    while(!stack.isEmpty() && precedence <= checkoperator(stack.peek())) {
                        char popped=stack.peek();
                        if(checkoperator(stack.peek())!=3 && checkoperator(stack.peek())!=4) list.add(popped);
                        stack.pop();
                    }
                    stack.push(ch);
                }
            }

        }
        else{
            list.add(ch);
        }
        return topostfix(s.substring(1),stack,list);
    }
    static int checkoperator(char ch){
        if(ch=='+' || ch=='-'){
            return 0;
        }
        if(ch=='*' || ch=='/' || ch=='%'){
            return 1;
        }
        if(ch=='^'){
            return 2;
        }
        if(ch=='(' || ch=='{' || ch=='['  ){
            return 3;
        }
        if( ch==')' || ch=='}' ||  ch==']'){
            return 4;
        }
        return -1;
    }
}
