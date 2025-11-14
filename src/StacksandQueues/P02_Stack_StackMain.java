package StacksandQueues;

public class P02_Stack_StackMain{
    public static void main(String[] args) throws Exception {
        //throws Exception since pop() and peek() throw exception
        dynamicStack();
    }
    static void customStack() throws Exception {
        P02_Stack_CustomStack stack= new P02_Stack_CustomStack(5);

        //1.Static Custom Stack
        //System.out.println(stack.push(7));

        stack.push(3);
        stack.push(18);
        stack.push(99);
        stack.push(56);
        stack.push(28);

        //length of custom static stack is 5
        //if we add one more item, error/message
        stack.push(16);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop()); //Exception


    }
    static void dynamicStack() throws Exception {
        P03_Stack_DynamicStack dynamicStack = new P03_Stack_DynamicStack(5);
        //OR
        //P02_Stack_CustomStack dynamicStack= new P03_Stack_DynamicStack(5);

        //2.Dynamic Custom Stack
        //but if we add element in a full dynamic stack, it will internally double the stack without error

        dynamicStack.push(3);
        dynamicStack.push(18);
        dynamicStack.push(99);
        dynamicStack.push(56);
        dynamicStack.push(28);
        dynamicStack.push(16);

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        //System.out.println(stack.pop()); //Exception

    }

}
