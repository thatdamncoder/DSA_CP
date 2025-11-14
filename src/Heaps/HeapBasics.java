package Heaps;

public class HeapBasics {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap=new Heap<>();
        heap.insert(34);
        heap.insert(26);
        heap.insert(45);
        heap.insert(53);
        heap.insert(73);

        System.out.println(heap.heapsort());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());





    }
}
