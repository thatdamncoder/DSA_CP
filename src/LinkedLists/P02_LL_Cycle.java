package LinkedLists;
//Fast and Slow pointer method

//https://leetcode.com/problems/linked-list-cycle/

import javax.sound.sampled.Line;

class LinkedList{
    Node head;
    LinkedList(){
    }
    private class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
        }
        Node(int value,Node next){
            data=value;
            this.next=next;
        }
    }
}
public class P02_LL_Cycle {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
    }
//    static boolean hasCycle(){
//        Node fast=head;
//        Node slow=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                return true;
//            }
//
//        }
//        return false;
//    }

    //my approach
//    static int noOfNodesInCycle(){
//        Node fast=head;
//        Node slow=head;
//        int fastcount=0;
//        int slowcount=0;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            fastcount++;
//            slowcount++;
//            slow=slow.next;
//            if(fast==slow){
//                return (int)(fastcount+slowcount)/2;
//            }
//        }
//        return 0;
//    }
//    static int lengthCycle(){
//        Node fast=head;
//        Node slow=head;
//        int count=0;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                //calculate the length
//                //keep the fast pointer as it as
//                //move the slow pointer until it comes back to fast
//                //that is slow will complete a cycle and come back to its original position
//                //count when slow is taking a round
//                do{
//                    slow=slow.next;
//                    count++;
//                }while(slow!=fast);
//                return count;
//            }
//        }
//        return 0;
//    }

//    static Node startingNodeOfCycle(){
//        int length=0;
//        Node fast=head;
//        Node slow=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                length=lengthCycle();
//            }
//        }
//        //find the starting node
//        //move l steps l=length
//        //then move first and second pointer, where they meet- start of the cycle
//
//        Node first=head;
//        Node second=head;
//        while(length!=0){
//            second=second.next;
//            length--;
//        }
//       while(first!=second){
//           first=first.next;
//           second=second.next;
//       }
//       return first;
//    }

}
