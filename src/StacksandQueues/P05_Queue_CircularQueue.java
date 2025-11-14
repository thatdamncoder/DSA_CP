package StacksandQueues;

public class P05_Queue_CircularQueue {
    private int[] data;
    protected static final int DEFAULT_SIZE=10;
    int end=0;
    int front=0;
    int size;

    public P05_Queue_CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public P05_Queue_CircularQueue(int size) {
        this.data= new int[size];
    }
    public void insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Circular Queue is full");
        }
        data[end++]=item;
        end=end%data.length;
    }
    public int remove(){
        int item=data[front];
        front++;
        end=end%data.length;
        return item;
    }
    public void display() throws Exception{
//        if(front==end){
//            throw new Exception("Cannot display empty queue");
//        }
        int temp=front;
        while(temp!=end) {
//            System.out.print(data[front]);
//            if(front==data.length){
//                System.out.println(front-);
//            }
//            if(end<front){
//                System.out.print(data[end-data.length]);
//            }
            System.out.println(data[temp]+ " ");
            temp++;
        }
        System.out.println("END");
    }
    private boolean isFull() {
        return size==data.length;
    }
    private boolean isEmpty() {
        return size==0;
    }
}
