package Trees;

public class P03_AVL_Class {
    private Node root;

    P03_AVL_Class(){
    }
    public int height(){
        return getHeight(root);
    }
    private int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    public void populate(int[] nums){
        for (int i : nums) {
            this.insert(i);
        }
    }
    public void insert(int value){
        root=insertNode(root,value);
    }
    private Node insertNode(Node node, int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(node.value<value){
            node.right=insertNode(node.right,value);
        }
        if(node.value>value){
            node.left=insertNode(node.left,value);
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right)) + 1;
        return rotate(node);
    }
    private Node rotate(Node node) {
        if(Math.abs(getHeight(node.left)-getHeight(node.right))>1){
            //left heavy
            if(getHeight(node.left.left)- getHeight(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }
            if(getHeight(node.left.left)- getHeight(node.left.right)<0){
                //left right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        else{
            //right heavy
            if(getHeight(node.right.right)- getHeight(node.right.left)>0){
                //right-right case
                return leftRotate(node);
            }
            if(getHeight(node.right.left)- getHeight(node.right.right)<0){
                //right left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    private Node leftRotate(Node parent){
        Node child=parent.right;
        Node temp=child.left;
        child.left=parent;
        parent.right=temp;

        parent.height=Math.max(getHeight(parent.left),getHeight(parent.right))+1;
        child.height=Math.max(getHeight(child.left),getHeight(child.right))+1;
        return child;

    }
    private Node rightRotate(Node parent){
        Node child=parent.left;
        Node temp=child.right;
        child.right=parent;
        parent.left=temp;

        parent.height=Math.max(getHeight(parent.left),getHeight(parent.right))+1;
        child.height=Math.max(getHeight(child.left),getHeight(child.right))+1;
        return child;
    }

    private class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

    }
}
