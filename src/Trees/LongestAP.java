package Trees;

class Node{
    int val;
    Node left,right;
    public Node(int val){
        this.val=val;
    }
}
public class LongestAP {
    static int ans;
    public static int[][] maxAP(Node root){
        //longest path AP from any node to any node
        int leftdiff=Integer.MAX_VALUE;
        int leftdist=0;
        int rightdiff=Integer.MAX_VALUE;
        int rightdist=0;
        if(root==null) return new int[][]{new int[]{leftdiff,leftdist},new int[]{rightdiff,rightdist}};

        int[][] left=maxAP(root.left);
        int[][] right=maxAP(root.right);
        if(root.left!=null) leftdiff=root.val-root.left.val;
        if(root.right!=null) rightdiff=root.val-root.right.val;
        if(left[0][0]==leftdiff || left[0][0]==Integer.MAX_VALUE){
            leftdist=Math.max(leftdist,left[0][1]);
        }
        if(left[1][0]==leftdiff || left[1][0]==Integer.MAX_VALUE){
            leftdist=Math.max(leftdist,left[1][1]);
        }
        if(right[0][0]==rightdiff || right[0][0]==Integer.MAX_VALUE){
            rightdist=Math.max(rightdist,right[0][1]);
        }
        if(right[1][0]==rightdiff || right[1][0]==Integer.MAX_VALUE){
            rightdist=Math.max(rightdist,right[1][1]);
        }

        if(leftdiff==(-1*rightdiff)){
            ans=Math.max(ans,leftdist+rightdist+1);
        }
        else ans=Math.max(ans,1+Math.max(leftdist,rightdist));
        return new int[][]{new int[]{leftdiff,leftdist},new int[]{rightdiff,rightdist}};
    }
    public static int longstraight(Node root,char dir){
        //longest straight path
        if(root==null) return 0;
        int left=longstraight(root.left,'L');
        int right=longstraight(root.right,'R');

        ans=Math.max(ans,Math.max(left,right));
        if(dir=='N') return Math.max(left,right);
        return (dir=='L')?left+1:right+1;
    }
    public static int longCons(Node root){
        //longest increasing path
        if(root==null) return 0;
        int left=longCons(root.left);
        int right=longCons(root.right);
        int leftdiff=0;
        int rightdiff=0;
        if(root.left!=null) leftdiff=root.val-root.left.val;
        if(root.right!=null) rightdiff=root.val-root.right.val;

        int currans=0;
        if(leftdiff<0 && rightdiff<0) currans=Math.max(left,right);
        else if(leftdiff<0) currans=left;
        else currans=right;

        if(leftdiff==(-1*rightdiff)) ans=Math.max(ans,left+right+1);
        ans=Math.max(ans,currans+1);
        return currans+1;
    }
    public Node remove(Node root,int sum,int k){
        //remove nodes such that sum of all root to leaf paths is atleast k
        if(root==null) return null;
        root.left=(root.left!=null?remove(root.left,sum+root.left.val,k):null);
        root.right=(root.right!=null?remove(root.right,sum+root.right.val,k):null);
        if(root.left==null && root.right==null){
            return (sum)>=k?root:null;
        }
        return root;
    }
    public void main(String[] args) {

    }
}
