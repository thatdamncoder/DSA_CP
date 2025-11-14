package LinkedLists;

public class P01_LL_Class {
    private Node head;
    private int size;

    public P01_LL_Class(){
        size=0;
    }

    public void insertFront(int value){
        Node newnode= new Node(value);
        if(head==null) {
            //first node
            head=newnode;
            newnode.next=null;
            size++;
            return;
        }
        Node temp=head;
        newnode.next=temp;
        head=newnode;

        size++;
    }
    public void insertEnd(int value){
        if(head==null){
            insertFront(value);
            return;
        }
        Node newnode=new Node(value);
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
        size++;
    }
    public void insertBeforeNode(int value,int before){
        Node prevnode=findprevNode(before);
        Node newnode = new Node(value,prevnode.next);
        prevnode.next=newnode;
        size++;
    }
    public void insertAfterNode(int value,int after){
        Node currentnode=findexactNode(after);
        if(currentnode==null){
            return;
        }
        Node newnode=new Node(value,currentnode.next);
        currentnode.next=newnode;
        size++;
    }

    public void insertRecursion(int value,int index){
        insertRec(value,index,head);
    }
    private Node insertRec(int value,int index,Node node){
        if(index==0){
            Node newnode= new Node(value,node);
            return newnode;
        }
        if(index>size){
            System.out.println("index not found");
            return node;
        }
        Node returnednode= insertRec(value,index-1,node.next);
        node.next=returnednode;
        return node;
    }

    public void deleteDuplicate(){
        if(head==null){
            return;
        }
        if(head.next==null){
            return;
        }
        Node temp=head;
        while(temp.next!=null) {
            if (temp.next.data == temp.data) {
                if(temp.next.next==null){
                    temp.next=null;
                    size--;
                    return;
                }
                temp.next = temp.next.next;
                size--;
            }
            else {
                temp = temp.next;
            }
        }

    }

    //merge method 1 - me
    public static void merge(P01_LL_Class list1,P01_LL_Class list2){
        mergeSortedOrder(list1,list2);
    }
    static void mergeSortedOrder(P01_LL_Class list1,P01_LL_Class list2){
        Node temp1=list1.head;
        Node temp2=list2.head;

        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=temp2;
        list2.head=list1.head;
        sortLL(list1);
    }
    private static void sortLL(P01_LL_Class list){
        if(list.issorted()){
            return;
        }
        Node temp=list.head;
        while(temp.next!=null) {
            if (temp.data > temp.next.data) {
                int t = temp.data;
                temp.data = temp.next.data;
                temp.next.data = t;
            } else {
                temp = temp.next;
            }
        }
        sortLL(list);
    }
    private boolean issorted(){
        Node temp=head;
        if(temp.next==null){
            return true;
        }
        while(temp.next!=null){
            if(temp.data>temp.next.data){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }



    //merge method 2  - kunal (better) - resembles merge sort
    public static P01_LL_Class mergeSortedLists(P01_LL_Class list1,P01_LL_Class list2){
        Node head1=list1.head;
        Node head2=list2.head;
        P01_LL_Class answer= new P01_LL_Class();

        while(head1!=null && head2!=null){
            if (head1.data < head2.data) {
                answer.insertEnd(head1.data);
                head1=head1.next;
            } else {
                answer.insertEnd(head2.data);
                head2=head2.next;
            }
        }
        if(head1==null){
            while(head2!=null){
                answer.insertEnd(head2.data);
                head2=head2.next;
            }
            return answer;
        }
        while(head1!=null) {
                answer.insertEnd(head1.data);
                head1 = head1.next;
        }
        return answer;

    }
    public int count_node(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = head.next;
//
//        do{
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//            next=next.next;
//        }
        while (curr!= null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        head=curr;
    }

    public void tryrevnode(){
        reverserecursioncallstry(head);
    }
    private Node reverserecursioncallstry(Node last){
        if(last.next==null){
            return last;
        }
        Node prev=reverserecursioncallstry(last.next);
        System.out.println(prev.data);
        if(last==head){
            System.out.println(head.data);
        }

        return last;
    }
    public void sortSwapData(){
        if(head==null || head.next==null){
            return;
        }
        Node temp=head;

        do{
//        while(temp.next!=null){
            if(temp.data>temp.next.data){
                int t=temp.data;
                temp.data=temp.next.data;
                temp.next.data=t;
            }
            else{
                temp = temp.next;
            }
        }while(temp.next!=null);
    }
    public Node findprevNode(int value){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.next.data!=value){
            temp=temp.next;
        }
        return temp;
    }
    public Node findexactNode(int value){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.data!=value){
            temp=temp.next;
            if(temp==null){
                System.out.println("Node not found");
                return temp;
            }
        }

        return temp;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int value){
            data=value;
        }
        public Node(int value,Node next){
            data=value;
            this.next=next;
        }

    }
}
