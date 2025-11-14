package StacksandQueues;

import java.sql.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P06_QueueUsingStack {
    public static void main(String[] args) {
        System.out.println(queueStack(new Stack<>(),0,-1));
    }
    static int queueStack(Stack<Integer> stack,int i,int top){
        int[] array={2,3,45,5,1};
        if(top== array.length-1 || i== array.length-1){
            int pop=stack.pop();
            return pop;
        }
        stack.push(array[i]);
        return queueStack(stack,i+1,top++);
       // System.out.println(r);
    }
}
