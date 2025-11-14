package Trees;


public class P04_Segment_Class {
    private Node root;

    public P04_Segment_Class(int[] arr){
        this.root=construct(arr,0,arr.length-1);
    }

    private Node construct(int[] arr, int start, int end) {
        if(start==end){
            Node leaf=new Node(start,end);
            leaf.value=arr[start];
            return leaf;
        }
        Node node=new Node(start,end);
        int mid=start - (start-end)/2;
        node.left=this.construct(arr,start,mid);
        node.right=this.construct(arr,mid+1,end);

        //since query here is sum
        node.value=node.left.value + node.right.value;
        return node;
    }

    public int sum(int qsi,int qei){
        return sumQuery(this.root,qsi,qei,0);
    }
    private int sumQuery(Node node,int qsi,int qei,int sum){
        if(node.start > qei || node.end < qsi){
            return sum;
        }
        else if(node.start>=qsi && node.end<=qei){
            sum=sum+node.value;
            return sum;
        }
//        if(node.start>qsi && node.end<qei || node.start>qsi && node.end>qei ){
        else{
            sum=sum+sumQuery(node.left,qsi,qei,sum) + sumQuery(node.right,qsi,qei,sum);
            //writing sumQuery(node.right,qsi,qei,sum) in different line may give false result
        }
        return sum;
    }

//    public void update(int index,int value){
//        this.root.value=update(this.root,index,value);
//    }
//    private int update(Node node,int index,int value){
//        if(index>=node.start && index<=node.end) {
//            if (index == node.start && index == node.end) {
//                node.value = value;
//                return node.value;
//            } else if (node.start < index && index < node.end) {
//                int leftAns = update(node.left, index, value);
//                int rightAns = update(node.right, index, value);
//                node.value = leftAns + rightAns;
//                return node.value;
//            }
//        }
//        return node.value;
//    }
public void update(int index, int value) {
    update(root, index, value);
}
private void update(Node node, int index, int value) {
    if (node.start == index && node.end==index) {
        node.value = value;
        return;
    }
    if (index >= node.start && index <= node.end) {
        int mid = node.start + (node.end - node.start) / 2;
        if (index <= mid) {
            update(node.left, index, value);
        } else {
            update(node.right, index, value);
        }
        node.value = node.left.value + node.right.value;
    }
}


    public void display(){
//        display(this.root);
        prettyprinting(this.root,0);
    }
    private void display(Node node){
        if(node==null){
            return;
        }
        System.out.println("parent " + node.value + " + " + "[" + node.start + "," + node.end + "]");
        display(node.left);
        System.out.println("child " + node.value + " + " + "[" + node.start + "," + node.end + "]");
        display(node.right);
    }

    private void prettyprinting(Node node, int level){
        if(node==null) {
            return;
        }
        prettyprinting(node.right,level+1);
        if(level==0){
            System.out.println(node.value + " [" + node.start + "," + node.end + "]");
        }
        else{
            for(int i=1;i<level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.value + " [" + node.start + "," + node.end + "]");
        }
        prettyprinting(node.left,level+1);
    }
    private class Node{
        private int value;
        private int start;
        private int end;
        private Node left;
        private Node right;

        public Node(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
}
