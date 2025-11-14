package RandomTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class sortUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] arr={3,2,1,5,4};
        //System.out.println(sortarr(arr,stack,0));
        //System.out.println(Arrays.toString(sortarrworecursion(arr,stack)));
        //System.out.println(Arrays.toString(arr));
        //sort(arr);
        System.out.println(Arrays.toString(sort(arr)));

    }
    static Stack<Integer> sortarr(int[] arr,Stack<Integer> stack, int index){
        if(index==arr.length-1) {
            return stack;
        }
        if(stack.isEmpty()){
            stack.push(arr[index]);
            return sortarr(arr,stack,index+1);
        }
        if(arr[index]<stack.peek()){
            return sortarr(arr,stack,index+1);
        }
        else{
            stack.pop();
            sortarr(arr,stack,index+1);

        }
        return stack;
    }
    static int[] sortarrworecursion(int[] arr,Stack<Integer> stack) {
        Stack<Integer> stacknew= new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(!stack.isEmpty() && arr[i]<stack.peek()){
                arr[i]=stacknew.pop();
            }
            stacknew.push(arr[i]);
        }
        for (int i = arr.length-1; i>=0 ; i--) {
            arr[i]=stacknew.pop();
        }
        return arr;
    }

    static int[] sort(int[] array) {
//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stackstored = new Stack<>();
//
//        for (int i = 0; i < array.length; i++) {
//            while (!stack1.isEmpty() && array[i] < stack1.peek()) {
//                stackstored.push(stack1.pop());
//            }
//            stack1.push(array[i]);
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            array[i] = stackstored.pop();
//        }
//        return array;


            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stackstored = new Stack<>();
            Stack<Integer> reversedStack = new Stack<>(); // To reverse the order of elements

            for (int i = 0; i < array.length; i++) {
                while (!stack1.isEmpty() && array[i] < stack1.peek()) {
                    stackstored.push(stack1.pop());
                }
                stack1.push(array[i]);
            }

            while (!stackstored.isEmpty()) {
                reversedStack.push(stackstored.pop());
            }

            for (int i = 0; i < array.length; i++) {
                array[i] = reversedStack.pop();
            }

            return array;




    }
}

