package LinkedLists;
//leetcode singly linkedlist declaration class



public class ListNode {
      int val;
      ListNode next;
      ListNode() {
      }
      ListNode(int val) {
          this.val = val;
      }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
//     public ListNode mergeSort(ListNode head){
//          if(head==null || head.next==null){
//              return head;
//          }
//          ListNode mid=findmid(head);
//          ListNode left=mergeSort(head);
//          ListNode right=mergeSort(mid);
//
//          return mergelists(left,right);
//     }
//     public ListNode findmid(ListNode head){
//         ListNode fast=head;
//         ListNode slow=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next;
//         }
//         return slow;
//     }
//     public ListNode mergelists(ListNode head1,ListNode head2){
//         ListNode answer= new ListNode();
//
//         while(head1!=null && head2!=null){
//             if (head1.val < head2.val) {
//                 answer.insertEnd(answer,head1.val);
//                 head1=head1.next;
//             } else {
//                 answer.insertEnd(answer,head2.val);
//                 head2=head2.next;
//             }
//         }
//         if(head1==null){
//             while(head2!=null){
//                 answer.insertEnd(answer,head2.val);
//                 head2=head2.next;
//             }
//             return answer;
//         }
//         while(head1!=null) {
//             answer.insertEnd(answer,head1.val);
//             head1 = head1.next;
//         }
//         return answer;
//     }
//     public void insertEnd(ListNode head,int value){
//          if(head==null){
//              head.val=value;
//              head.next=null;
//              return;
//          }
//          ListNode temp=head;
//          ListNode newnode=new ListNode(value,null);
//          while(temp.next!=null){
//              temp=temp.next;
//          }
//          temp.next=newnode;
//
//     }

    public ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode left=mid;
        ListNode right=mid.next;

        left=mergeSort(left);
        right=mergeSort(right);
        return mergelists(left,right);

    }
    public ListNode findmid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public ListNode mergelists(ListNode head1,ListNode head2){
        ListNode answer= new ListNode();

        while(head1!=null && head2!=null){
            if (head1.val < head2.val) {
                insertEnd(answer,head1.val);
                head1=head1.next;
            } else {
                insertEnd(answer,head2.val);
                head2=head2.next;
            }
        }

        while(head2!=null){
            insertEnd(answer,head2.val);
            head2=head2.next;
        }

        while(head1!=null) {
            insertEnd(answer,head1.val);
            head1 = head1.next;
        }
        return answer;
    }
    public ListNode insertEnd(ListNode head,int value){
        ListNode newnode=new ListNode(value,null);
        if(head==null){
            head=newnode;
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
        return head;
    }
//    public void insertFront(ListNode head,int value){
//        ListNode newnode= new ListNode(value);
//        if(head==null) {
//            //first node
//            head=newnode;
////            head.val=value;
////            newnode.next=null;
//            return;
//        }
//        ListNode temp=head;
//        newnode.next=temp;
//        head=newnode;
//    }

    public ListNode display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
        return head;
    }


    //Palindrome
    public boolean revCheckForPalin(ListNode head){
          if(head==null || head.next==null){
              return false;
          }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }

        ListNode mid=slow;
        //mid==slow OR slow==prev
        ListNode curr=slow.next;

        do{
            curr.next=slow;
            slow=curr;
            curr=curr.next;
        }while(curr.next!=null);

        prev.next=curr;
        mid.next=null;

        return ispalindrome(head);
    }
    public boolean ispalindrome(ListNode head){
          ListNode first=head;
          ListNode mid=findmid(head);
          ListNode second=mid;

          while(first!=mid && second!=null) {
              if (first.val != second.val) {
                  return false;
              }
              first = first.next;
              second = second.next;
          }
          return false;
    }

    //Reorder list
    public ListNode reorder(ListNode head, ListNode last){
          if(head==null ||  head.next==null){
              return head;
          }
          if(last.next==null){
              return last;
          }
          ListNode temp=head;
          reorder(head,last.next);
          ListNode mid=findmid(head);
          ListNode save=temp.next;
          if(last==save){
            return head;
          }
          temp.next=last;
          last.next=save;
          temp=save;

          return head;
    }

    //reverse part of LL
    public ListNode reversePartOfLL(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right){
            return head;
        }

        // ListNode temp=head;
        // int i=left-1;
        // while(i>1){
        //     temp=temp.next;
        //     i--;
        // }

        ListNode prev=null;
        ListNode curr=head;

        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode saveprev=prev;
        ListNode savecurr=curr;


        ListNode next=curr.next;

        while (left<=right && curr!=null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
            left++;
        }
        if(saveprev==null){
            head=prev;
        }
        else{
            saveprev.next=prev;
        }
        savecurr.next=curr;
        return head;
    }


    //reverse k nodes
    public ListNode reverseK(ListNode head, int k){
        return reversePartOfLLknodes(head,1,k,k);

    }
    public ListNode reversePartOfLLknodes(ListNode head, int left, int right,int k) {
        if(head==null || head.next==null || left==right || left+k>countnode(head)){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;

        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode saveprev=prev;
        ListNode savecurr=curr;


        ListNode next=curr.next;

        while (left<=right && curr!=null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
            left++;
        }
        if(saveprev==null){
            head=prev;
        }
        else{
            saveprev.next=prev;
        }
        savecurr.next=curr;
        return reversePartOfLLknodes(head,right+1,right+k,k);
    }
    private int countnode(ListNode head){
        ListNode temp=head;
        int count=1;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode reverseKalternateGFG(ListNode head, int left, int right,int k) {
        if(head==null || head.next==null || left==right || left+k>countnode(head)){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;

        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode saveprev=prev;
        ListNode savecurr=curr;


        ListNode next=curr.next;

        while (left<=right && curr!=null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
            left++;
        }
        if(saveprev==null){
            head=prev;
        }
        else{
            saveprev.next=prev;
        }
        savecurr.next=curr;
        return reverseKalternateGFG(head,left+k,right+(2*k),k);
    }

    //rotate linked list k times

    public ListNode rotateLLBunchwise(ListNode head,int k){
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }

        k=k%length;

        if(k<=0){
            return head;
        }

        ListNode prevnewhead=head;
        for(int i=0;i<length-k-1;i++){
            prevnewhead=prevnewhead.next;
        }
        tail.next=head;
        ListNode newhead=prevnewhead.next;
        prevnewhead.next=null;
        return newhead;


    }


}
