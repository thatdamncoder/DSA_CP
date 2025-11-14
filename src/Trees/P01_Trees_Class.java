package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//binary trees (not binary search trees)
public class P01_Trees_Class {
    private Node root;

    P01_Trees_Class(){

    }

    public void insertNode(Scanner scanner){
        System.out.println("Enter value for root node:- ");
        int rootvalue=scanner.nextInt();
        root=new Node(rootvalue);
        populate(scanner,root);
    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Want to insert new node to the left of " + node.data + " ?");
        boolean toleft = scanner.nextBoolean();
        if(toleft){
            System.out.println("Enter value:- ");
            int leftvalue=scanner.nextInt();
            node.left=new Node(leftvalue);
            populate(scanner,node.left);
        }
        System.out.println("Want to insert new node to the right of " + node.data + " ?");
        boolean toright = scanner.nextBoolean();
        if(toright){
            System.out.println("Enter value:- ");
            int rightvalue=scanner.nextInt();
            node.right=new Node(rightvalue);
            populate(scanner,node.right);
        }
    }

    public void preorder(){
        System.out.println("Preorder of the tree gives:- ");
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        System.out.println("Inorder of the tree gives:- ");
        inorder(root);
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    public void postorder(){
        System.out.println("Postorder of the tree gives:- ");
        postorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    public int a(){
        avg(root);
        return ncount;
    }
    int ncount=0;
    int leftans=0;
    int rightans=0;
    public int avg(Node node){
         if(node==null){
             return 0;
         }

         leftans=leftans+avg(node.left);
         rightans=rightans+avg(node.right);
         int sum=leftans+rightans+node.data;

        System.out.print(leftans + " + "  + rightans + " + " + node.data + " / ");
         int h=noOfNodes(node);
        System.out.println(h);
          int result=(int)(Math.floor((leftans+rightans+node.data)/h));
         if(result==node.data){
             System.out.println("node caught : " + result);
             ncount=ncount+1;
         }
         leftans=0;
         rightans=0;
         return node.data;
    }
    public int noofNodes(Node node){
        if(node==null){
            return 0;
        }
        int left=noOfNodes(node.left);
        int right=noOfNodes(node.right);

        return left+right+1;
    }
    private int noOfNodes(Node node){
        if(node==null){
            return 0;
        }
        int left=noOfNodes(node.left);
        int right=noOfNodes(node.right);

        return left+right+1;
    }

    public int minnode(){
        return minimumnode(root);
    }
    private int minimumnode(Node node){
        if(node==null) {
            return Integer.MIN_VALUE;
        }
        int min=node.data;
        int leftmin=minimumnode(node.left);
        int rightmin=minimumnode(node.right);
        if(leftmin<min) min=leftmin;
        if(rightmin<min) min=rightmin;
        return min;
    }
    public int[] mineithersides(){
        return minimumelement(root);
    }
    private int[] minimumelement(Node node){
        if(node==null){
            return new int[] {-1,-1};
        }
        int minleft=(node.left==null)?node.data : node.left.data;
        int minright=(node.right==null)?node.data :node.right.data;
        int[] left=minimumelement(node.left);
        int[] right=minimumelement(node.right);

        if(left[0]<right[0]) minleft=left[0];
        if(right[1]<right[0]) minright=right[1];

        return new int[] {minleft,minright};

    }

    public void display(){
//        display(root,"");
        prettyprinting(root,0);
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.data);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void prettyprinting(Node node,int level){
        if(node==null) {
            return;
        }
        prettyprinting(node.right,level+1);
        if(level==0){
            System.out.println(node.data);
        }
        else{
            for(int i=1;i<level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.data);
        }
        prettyprinting(node.left,level+1);
    }
    public List<List<Integer>> anyPathEqualsSum(int target){
        List<List<Integer>> outerlist=new ArrayList<>();
        pathSumEqualsTargetAnyPath(root,target,new ArrayList<>(),outerlist);
        return outerlist;
    }
    private void pathSumEqualsTargetAnyPath(Node node, int target, List<Integer> list, List<List<Integer>> outerlist){
        if(node==null){
            return;
        }
        if(node.data==target){
            list.add(node.data);
            outerlist.add(new ArrayList<>(list));
        }
        list.add(node.data);
        pathSumEqualsTargetAnyPath(node.left,target-node.data,list,outerlist);
        pathSumEqualsTargetAnyPath(node.right,target-node.data,list,outerlist);
        list.remove(list.size()-1);
    }

    public void rootToLeaf1(Node root,List<Integer> list){
        if(root==null) return;
        list.add(root.data);
        if(root.left==null && root.right==null){
            System.out.println(list);
            list.remove(list.size()-1);
            return;
        }
        rootToLeaf1(root.left,list);
        rootToLeaf1(root.right,list);
        list.remove(list.size()-1);
    }
    public void rootToLeaf3Main(int m){
        rootToLeaf3(root,new ArrayList<>(),-1,m,m);
    }
    public void rootToLeaf3(Node root,List<Integer> list,int last,int m,int origM){
        if(root==null) return;
        int val=root.data;
        if(m<=0) return;
        if(root.left==null && root.right==null){
            if(val==0 && m<=1) return;
            list.add(val);
            System.out.println(list);
            list.remove(list.size()-1);
            return;
        }
        boolean con=false;
        if(val==last && val==0) con=true;
        list.add(val);
        rootToLeaf3(root.left,list,val,con?m-1:origM,origM);
        rootToLeaf3(root.right,list,val,con?m-1:origM,origM);
        list.remove(list.size()-1);
    }


    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){

            this.data=data;
        }
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
