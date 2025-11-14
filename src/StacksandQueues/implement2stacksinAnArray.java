package StacksandQueues;

public class implement2stacksinAnArray {
    public static class twostack{
        int[] arr;
        int top1;
        int top2;
        public twostack(int size){
            arr=new int[size];
            top1=-1;
            top2=size;
        }
        public void push1(int val){
            if(top1<top2-1) arr[++top1]=val;
        }
        public void push2(int val){
            if(top1<top2-1) arr[--top2]=val;
        }
        public int pop1(){
            return ((top1==-1)? -1:arr[top1--]);
        }
        public int pop2(){
            return (top2==arr.length)? -1:arr[top2++];
        }
    }
    public static void main(String[] args) {
        twostack stack= new twostack(8);
        System.out.println(stack.pop1());
        stack.push1(2);
        stack.push1(7);
        stack.push2(3);
        stack.push1(5);
        stack.push2(6);
        stack.push2(1);
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.pop1());
    }

}
