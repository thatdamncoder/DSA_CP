package StacksandQueues;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class P04_Queue_QueueMain {
    public static void main(String[] args) throws Exception {
        circularQueue();
    }
    static void customQueue() throws Exception {
        P04_Queue_CustomQueue queue= new P04_Queue_CustomQueue(5);
        //queue.display(); //exception-cannot display empty queue
        queue.insert(23);
        queue.insert(74);
        queue.insert(75);
        queue.insert(99);
        queue.insert(180);
        queue.display();

        System.out.println(queue.remove());
        queue.display();

    }
    static void circularQueue() throws Exception {
        P05_Queue_CircularQueue cqueue= new P05_Queue_CircularQueue();
        //queue.display(); //exception-cannot display empty queue
        cqueue.insert(23);
        cqueue.insert(74);
        cqueue.insert(75);
        cqueue.insert(99);
        cqueue.insert(180);
        System.out.println("original");
        cqueue.display();

        System.out.println("Removed item: "+ cqueue.remove());
        System.out.println("after removing");
        cqueue.display();

        System.out.println("adding 77");
        cqueue.insert(77);
        cqueue.display();



    }
}
