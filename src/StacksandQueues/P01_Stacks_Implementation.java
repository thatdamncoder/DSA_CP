package StacksandQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P01_Stacks_Implementation {
    public static void main(String[] args) {

        //ANALOGY- plates stacked at a wedding buffet LIFO
        Stack<Integer> stack= new Stack<>();
        stack.push(3);
        stack.push(18);
        stack.push(99);
        stack.push(56);
        stack.push(28);
        stack.push(18);
        System.out.println(stack.search(18));
        System.out.println(stack);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());  //will give error since the stack is empty


        //ANALOGY- customers waiting in queue at a Mcd takeaway  FIFO
//        Queue<Integer> queue= new LinkedList<>();  //interface therefore cannot use new Queue<>();
//        queue.add(24);
//        queue.add(34);
//        queue.add(2);
//        queue.add(-1);
//        queue.add(0);
//
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove()); //Error- no such element exception since queue is empty
    }
}
