package RandomTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class stackreverse {
    public static void main(String[] args) {
//        Stack<Integer> stack= new Stack<>();
//        stack.push(5);
//        stack.push(4);
//        stack.push(9);
//        stack.push(2);
//        stack.push(0);
//        System.out.println(stack);
//        rev(stack);
//        System.out.println(stack);
    }

    static void rev(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int t=stack.pop();
        rev(stack);
        insertBottom(stack,t);
    }
    static void insertBottom(Stack<Integer> stack,int item){
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int t=stack.pop();
        insertBottom(stack,item);
        stack.push(t);

    }
}
