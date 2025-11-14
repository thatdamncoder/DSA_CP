package StacksandQueues;
//Stack that never gets full-like we study in memory management
public class P03_Stack_DynamicStack extends P02_Stack_CustomStack{
    public P03_Stack_DynamicStack() {
        super(); //it will call  P02_Stack_CustomStack() constructor
    }
    public P03_Stack_DynamicStack(int size) {
        super(size);    ///it will call P02_Stack_CustomStack(int size) constructor
    }
    //all methods will be same except push(), therefore overriding


    @Override
    public boolean push(int item) {

        //takes care of stack being full
        if(this.isFull()){
            //doubling the size and copying the elements everytime the stack is full
            int[] newdata= new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                newdata[i]=data[i];
            }
            data=newdata;
        }
        //now we know that the stack is not full therefore we can add elements in the normal way
        //calling original push(item)

        return super.push(item);
    }
}
