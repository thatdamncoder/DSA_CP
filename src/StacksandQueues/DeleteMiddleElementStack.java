package StacksandQueues;

import java.util.Stack;

public class DeleteMiddleElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(-14);
        stack.push(89);
        stack.push(78);
        stack.push(45);
        stack.push(67);
        System.out.println(stack);
        int k=(stack.size()/2) + 1;
        deletemid(stack,k);
        System.out.println(stack);
    }
    static void deletemid(Stack<Integer> stack,int k){
        if(stack.size()==k){
            stack.pop();
            return;
        }
        int t=stack.pop();
        deletemid(stack,k);
        stack.push(t);
    }
}

