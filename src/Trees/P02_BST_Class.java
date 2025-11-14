package Trees;

import StacksandQueues.P02_Stack_CustomStack;

import java.util.*;

public class P02_BST_Class {

    Node root;


    P02_BST_Class(){

    }

    public void populate(int[] nums){
        // if the nums is sorted, it will give a skewed tree
        //to resolve this, use self-balancing trees
        for (int i : nums) {
            insert(i);
        }
        //if array is sorted and displaying tree without being skewed and without using self balancing trees
        //use
//        insertSortedArray(nums,0, nums.length-1);
    }
    private void insert(int value){
        root=insertNodeBST(root,value);
    }
    public void insertSortedArray(int[] nums,int start,int end){
        //nlogn since insertion in trees logn and inserting n elements
        if(start>=end){
            return;
        }
        int mid=start - (start-end)/2;
        insert(nums[mid]);
        insertSortedArray(nums,start,mid);
        insertSortedArray(nums,mid+1,end);
    }
    private Node insertNodeBST(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(node.value>value){
            node.left=insertNodeBST(node.left,value);
        }
        if(node.value<value){
            node.right=insertNodeBST(node.right,value);
        }
//        if(node.left!=null && node.right!=null) node.height=Math.max(node.left.height, node.right.height) + 1;
        return node;
    }

    private Node nodes(Node node){
        if(node==null){
            return null;
        }
        if(node.value==5){
            return node;
        }
        Node left=nodes(node.left);
        if(left!=null) return left;
        return nodes(node.right);
    }
    public int noofNodes(){
        Node n=nodes(root);
        return noOfNodes(n);
    }
    private int noOfNodes(Node node){
        if(node==null){
            return 0;
        }
        int left=noOfNodes(node.left);
        int right=noOfNodes(node.right);

        return left+right+1;
    }
    public void bfs(){
        bfs(root);
    }
    private List<List<Integer>> bfs(Node node){
        List<List<Integer>> result= new ArrayList<>();

        if(node==null){
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer> currentList= new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                Node popped=queue.poll();
                currentList.add(popped.value);
                if(popped.left !=null){
                    queue.offer(popped.left);
                }
                if(popped.right !=null){
                    queue.offer(popped.right);
                }
            }
            result.add(currentList);
        }
        return result;
    }
    public int nextsuccessor(int target){
        return nextsuccessorGoogleBFS(root,target);
    }
    private int nextsuccessorGoogleBFS(Node node,int targetNode){
        //if element found, insert its children first
        //because if there are no elements after target node
        //its first child will be its successor

        if(node==null){
            return -1;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);
        int result;
        while(!queue.isEmpty()){
            int levelSize= queue.size();
            //no for loop needed since not considering in groups of levels
            Node popped=queue.poll();
            if(popped.left !=null){
                queue.offer(popped.left);
            }
            if(popped.right !=null){
                queue.offer(popped.right);
            }
            if(popped.value==targetNode){
                Node successor=queue.peek();
                result=(successor==null)? -1 :successor.value;
                return result;
            }

        }
        return -1;
    }
    public int[] mineithersides(){
        return minimumelement(root);
    }
    private int[] minimumelement(Node node){
        if(node==null){
            return new int[] {-1,-1};
        }
        int minleft=(node.left==null)?node.value : node.left.value;
        int minright=(node.right==null)?node.value :node.right.value;
//        int minleft=node.value;
//        int minright=node.value;
        int[] left=minimumelement(node.left);
        int[] right=minimumelement(node.right);

        if(left[1]<left[0]) minleft=left[1]; else minleft=left[0];
        if(right[1]<right[0]) minright=right[1]; else minright=right[0];

        return new int[] {minleft,minright};

    }

//    public Node connect(Node node){
//        if(node==root){
//            node.next=null;
//        }
//        if(node.left==null || node.right==null){
//            return node;
//        }
//        node.left.next=node.right;
//        node.right.next= (node.next==null)? null : node.next.left;
//        connect(node.left);
//        connect(node.right);
//        return node;
//    }

    public void search(int value){
        root=searchNode(root,value);
    }

    private Node searchNode(Node node, int value){
        if(node!=null && node.value==value){
            return node;
        }
        if(node==null ){
            System.out.println("Element not found");
            return node;
        }

        if(value<node.value) {
            System.out.println("Left of " + node.value);
            node.left=searchNode(node.left, value);
        }
        if(value>node.value) {
            System.out.println("Right of " + node.value);
            node.right=searchNode(node.right, value);
        }
        return node;
    }


    public boolean isbalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(node.left.height - node.right.height)<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        prettydisplay(root,0);
    }
    private void prettydisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettydisplay(node.right,level+1);
        if(level==0){
            System.out.println(node.value);
        }
        else{
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---------->" + node.value);
        }
        prettydisplay(node.left,level+1);
    }
    public boolean sum(int target){
        System.out.println(sumofallnodes(root,target));
        return foundtarget;
    }
    int sum=0;
    boolean foundtarget=false;
    private int sumofallnodes(Node node,int target){
        if(node==null){
            return 0;
        }

        sum=sum+node.value;
        sumofallnodes(node.left,target);
        if(foundtarget) return node.value;

        sumofallnodes(node.right,target);
        if(sum==target){
            foundtarget=true;
            return node.value;
        }
        return sum;
    }
    private int sumofallnodes2(Node node,int target){
        if(sum==target){
            foundtarget=true;
            return node.value;
        }

        sum=sum+node.value;
        if(node.left!=null){
            if(sum+node.left.value<target){
                sum=sum+node.left.value;
            }
        }
        sumofallnodes2(node.left,target);
        if(foundtarget) return node.value;

        sumofallnodes2(node.right,target);

        return sum;
    }
    public List<List<Integer>> getAllPaths(){
        List<List<Integer>> outerlist=new ArrayList<>();
        getAllPaths(root,new ArrayList<>(),outerlist);
        return outerlist;
    }
    private void getAllPaths(Node node,List<Integer> list, List<List<Integer>> outerlist){
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(node.value);
            outerlist.add(new ArrayList<>(list));
        }
        getAllPaths(node.left, list, outerlist);
        list.add(node.value);
        getAllPaths(node.right, list, outerlist);
        list.add(node.value);

//        list.remove(list.size() - 1);
    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> check(){
        return allPathsSourceTarget(root);
    }
    public List<List<Integer>> allPathsSourceTarget(Node root) {
        List<Integer> path = new ArrayList<>();
        if(root != null) dfs(root, path);
        return res;
    }
    public void dfs(Node node, List<Integer> path) {
        path.add(node.value);
        if(node.left == null && node.right == null) {
            res.add(new ArrayList<>(path));
        } else {
            if(node.left != null) dfs(node.left, path);
            if(node.right != null) dfs(node.right, path);
        }
        path.remove(path.size() - 1);
    }
    public boolean pathExists(int[] arr){
        return pathExistsFromRootToLeaf(root,arr,0);
    }
    private boolean pathExistsFromRootToLeaf(Node node,int[] arr,int index){
        if(node==null){
            return false;
        }
        if(index>=arr.length || arr[index]!=node.value){
            return false;
        }
        if(node.left==null && node.right==null && arr[index]==node.value && index==arr.length-1){
            return true;
        }
        boolean left=pathExistsFromRootToLeaf(node.left,arr,index+1);
        boolean right=pathExistsFromRootToLeaf(node.right,arr,index+1);
        return left||right;
    }
    public List<Integer> viewtraversal(){
        List<Integer> list=new ArrayList<>();
        boundaryTriangleWoLeaf(root,root,1,1,list);
        return list;
    }
    private void boundaryTriangleWoLeaf(Node root,Node node,int left,int right,List<Integer> list){
        /*
                1
             2    3
           4  5  6  7
         output: 4 2 1 3 7
        */

        if(node==null){
            return;
        }
        if(right==1) {
            boundaryTriangleWoLeaf(root,node.left, left + 1,right,list);
            list.add(node.value);
        }
        if(left==1){
            if(node!=root) list.add(node.value);
            boundaryTriangleWoLeaf(root,node.right,left,right+1,list);

        }
    }

    int maxcapacity=0;
    private void leftView(Node node,int level,List<Integer> list){
        if(node==null){
            return;
        }
        if(maxcapacity<level){
            list.add(node.value);
            maxcapacity++;
        }
        leftView(node.left,level+1,list);
        leftView(node.right,level+1,list);
    }
    private void rightView(Node node,int level,List<Integer> list){
        if(node==null){
            return;
        }
        if(maxcapacity<level){
            list.add(node.value);
            maxcapacity++;
        }
        rightView(node.right,level+1,list);
        rightView(node.left,level+1,list);
    }

    private void leftMostLine(Node node,List<Integer> list){
        //from bottom to up
        if(node==null){
            return;
        }
        leftMostLine(node.left,list);
        list.add(node.value);
    }
    private void rightMostLine(Node node,List<Integer> list){
        //from bottom to up
        if(node==null){
            return;
        }
        leftMostLine(node.right,list);
        list.add(node.value);
    }
    private void leafnodes(Node node,List<Integer> list){
        //left to right
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            list.add(node.value);
        }
        leafnodes(node.left,list);
        leafnodes(node.right,list);
    }
    private void boundaryGfG(){
        //https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
        /*
               1
             2   3
            4 5  6 7
           8 9    0 1

         output: 1 2 4 8 9 0 1 7 3
         */

    }
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        Node(){height=0;}
        Node(int value){
            this.value=value;
        }
    }
}


/*
public List<List<Integer>> bfs(TreeNode node){
        List<List<Integer>> result= new ArrayList<>();

        if(node==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer> currentList= new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode popped=queue.poll();
                currentList.add(popped.val);
                if(popped.left !=null){
                    queue.offer(popped.left);
                }
                if(popped.right !=null){
                    queue.offer(popped.right);
                }
            }
            result.add(currentList);
        }
        return result;
    }
 */