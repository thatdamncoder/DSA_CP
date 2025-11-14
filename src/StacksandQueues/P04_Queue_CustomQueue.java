package StacksandQueues;

import com.sun.security.jgss.GSSUtil;

public class P04_Queue_CustomQueue {
    private int[] data;
    protected static final int DEFAULT_SIZE=10;
    int end=0;  //not working with two pointers, assuming end to be at 0 instead of -1, for simplicity

    public P04_Queue_CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public P04_Queue_CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        //since end=0, inserting first then incrementing
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot delete from empty queue");
        }
        //since we need to remove from the first FIFO
        //shift the elements to the left
        int removed=data[0];

        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot display empty queue");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }

    private boolean isFull() {
        return end==data.length;
    }
    private boolean isEmpty() {
        return end==0;
    }



}
