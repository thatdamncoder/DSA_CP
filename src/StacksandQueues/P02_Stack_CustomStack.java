package StacksandQueues;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;

public class P02_Stack_CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    public P02_Stack_CustomStack() {
        this(DEFAULT_SIZE);
    }
    public P02_Stack_CustomStack(int size) {
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
//        int item=data[ptr];
//        ptr--;
//        return item;
        //OR
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("No element in the array");
        }
       return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
