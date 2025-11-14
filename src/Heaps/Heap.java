package Heaps;

import java.util.ArrayList;
//starting from 0

public class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return 2*index+1;
    }
    private int right(int index){
        return 2*index+2;
    }
    public void insert(T item){
        list.add(item);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int parent=parent(index);
        if(list.get(index).compareTo(list.get(parent))<0){
            swap(parent,index);
            upheap(parent);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap");
        }
        T removed=list.get(0);
        swap(0, list.size()-1);
        list.remove(list.size()-1);
        if(!list.isEmpty()){
            downheap(0);
        }
        return removed;
    }
    private void downheap(int index) throws Exception{
        int start=index;
        int left=left(start);
        int right=right(start);

        //if left is present that is list has more than one element
        if(left<list.size() && list.get(start).compareTo(list.get(left))>0){
            start=left;
        }
        if(right<list.size() && list.get(start).compareTo(list.get(right))>0){
            start=right;
        }

        if(start!=index) {   //there is some element smaller than the root, swapping is required
            swap(start,index);
            downheap(start);
        }
    }

    public ArrayList<T> heapsort(){
        ArrayList<T> list1=new ArrayList<>();
        while(!list.isEmpty()){
            list1.add(list.remove(0));
        }
        return list1;
    }
}
