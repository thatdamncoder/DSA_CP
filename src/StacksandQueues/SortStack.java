package StacksandQueues;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        System.out.println(stack);
        sort(stack,true);
        System.out.println(stack);
    }
    static int sort(Stack<Integer> stack,boolean asc){
        if(stack.size()==1){
            return stack.peek();
        }
        int t=stack.pop();
        sort(stack,true);

        if(asc) insertBottom(stack,t);
        else insertBottomdesc(stack,t);

        return stack.peek();
    }
    static void insertBottom(Stack<Integer> stack,int item){
        if(stack.isEmpty() || stack.peek()>item){
            stack.push(item);
            return;
        }
        int t=stack.pop();
        insertBottom(stack,item);
        stack.push(t);
    }

    static void insertBottomdesc(Stack<Integer> stack,int item){
        if(stack.isEmpty() || stack.peek()<item){
            stack.push(item);
            return;
        }
        int t=stack.pop();
        insertBottomdesc(stack,item);
        stack.push(t);
    }
}
