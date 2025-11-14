//package Trees;
//
//import java.util.*;
//
//public class NaryTrees {
//    Map<Integer,List<Integer>> map;
//    public int sameValues(int s,int parent,int[] ans){
//        //https://www.geeksforgeeks.org/maximum-count-of-connected-duplicate-nodes-in-given-n-ary-tree/?ref=lbp
//
//        int result=1;
//        for(int adjNode:map.get(s)){
//            if(adjNode!=parent){
//                int fromChildren=sameValues(adjNode,s,ans);
//                if(adjNode==s) result+=fromChildren;
//            }
//        }
//        ans[0]=Math.max(ans[0],result);
//        return result;
//    }
//    public int evenSubtrees(int s,int parent,int[] ans){
//        int size=1;
//        for(int adjNode:map.get(s)){
//            if(adjNode!=parent){
//                size+=evenSubtrees(adjNode,s,ans);
//            }
//        }
//        if(size%2==0) ans[0]++;
//        return size;
//    }
//    public void specialNodes(int s, int parent, Set<Integer> set, int[] ans){
//        if(set.contains(s)) return;
//        ans[0]++;
//        set.add(s);
//        for(int adjNode:map.get(s)){
//            if(adjNode!=parent){
//                specialNodes(adjNode,s,set,ans);
//            }
//        }
//        set.remove(set.size()-1);
//    }
//    public List<Integer> maxPathSum(int s,int parent,int[] ans){
//        List<Integer> result=new ArrayList<>();
//        for(int adjNode:map.get(s)){
//            if(s!=parent){
//                result.addAll(maxPathSum(adjNode,s,ans));
//            }
//        }
//        int max=Integer.MIN_VALUE;
//        int secmax=Integer.MIN_VALUE;
//        if(result.size()>=2){
//            for(int ele:result){
//                if(ele>max){
//                    secmax=max;
//                    max=ele;
//                }
//                else if(secmax<ele){
//                    secmax=ele;
//                }
//            }
//            int includeRoot=max+secmax+s;
//            ans[0]=Math.max(ans[0],includeRoot);
//            int currmax=Math.max(s,max+s);
//            ans[0]=Math.max(ans[0],currmax);
//            return List.of(currmax);
//        }
//
//        if(!result.isEmpty()) max=result.get(0);
//        if(max!=Integer.MIN_VALUE) ans[0]=Math.max(ans[0],Math.max(s,max+s));
//        return List.of(Math.max(max+s,s));
//    }
//    public boolean symmetricNary(int s1,int s2){
//        if(s1!=s2 || map.get(s1).size()!=map.get(s2).size()) return false;
//        int size=map.get(s1).size();
//        for(int i=0;i<size/2;i++){
//            if(!symmetricNary(map.get(s1).get(i),map.get(s2).get(size-i-1))){
//                return false;
//            }
//        }
//        return true;
//    }
//    public int nodesBetweenNodeRoot(Node root,int node1){
//        if(root.val==node1) return 1;
//        int ans=0;
//        for(Node child:root.children){
//            int f=nodesBetweenNodeRoot(child,node1);
//            if(f>=1) {
//                return f+1;
//            }
//        }
//        return ans;
//
//    }
//    public boolean binarySubtree(Node root,int[] result){
//        if(root==null) return true;
//        boolean isBinary=(root.children.size()<=2);
//        for(Node child:root.children) {
//            isBinary=isBinary&binarySubtree(child,result);
//        }
//        if(isBinary) result[0]++;
//        return isBinary;
//    }
//    public String duplicateSubtree(Node root){
//        //space - O(n2) in case of skewed
//        String s=root.val+"";
//        for(Node child:root.children){
//            s=s+"$"+duplicateSubtree(child);
//        }
//        if(freq.containsKey(s)) ans++;
//    }
//    public int leafNodes(int s){
//        if(map.get(s).size()==0) return 1;
//        int leaves=0;
//        for(int adjNode:map.get(s)){
//            int l=leafNodes(adjNode);
//            map.put(adjNode,l);
//            leaves+=l;
//        }
//        map.put(s,leaves);
//        return leaves;
//    }
//    public Node construct(List<Integer> list){
//        //https://www.geeksforgeeks.org/
//        //construct-an-n-ary-tree-having-no-pair-of-adjacent-nodes-with-same-weight-from-
//        // given-weights/?ref=lbp
//
//        int max=list.get(0); int min=list.get(0);
//        for(int i:list){
//            max=Math.max(max,i);
//            min=Math.min(min,i);
//        }
//        if(max==min) return null;
//        Node root=new Node(list.get(0));
//        boolean[] visited=new boolean[list.size()];
//        visited[0]=true;
//        for(int i=0;i<list.size();i++){
//            if(!visited[i] && list.get(i)!=root.val){
//                visited[i]=true;
//                root.children.add(new TreeNode(list.get(i)));
//            }
//        }
//        //connect others to any child of the root
//        return root;
//    }
//    public int sameDistLeaves(Node root){
//        if(root.children.size()==0) return 1;
//        int height=0;
//        for(Node child:root.children){
//            int dist=sameDistLeaves(child);
//            if(height==0) height=dist;
//            else if(height==-1 || dist!=height){
//                height=-1;
//            }
//        }
//        if(height!=-1) list.add(root);
//        return height==-1?-1:height+1;
//    }
//    public int orOfsubtree(int s,int[] ans){
//        int or=s;
//        for(int adjNode:map.get(s)){
//            or|=orOfsubtree(adjNode,ans);
//        }
//        ans[s]=or;
//        return or;
//    }
//    class NaryNode{
//        int val;
//        List<NaryNode> children;
//        public NaryNode(int val) {
//            this.val = val;
//            this.children = new ArrayList<>();
//        }
//    }
//    //brute force- T.C - O(N^2) S.C- O(N)(max height in skewed tree)
//    public boolean dfs(NaryNode root,NaryNode target){
//        if(root==null || target==null) return false;
//        if(root.val==target.val && isSubtree(root,target)) return true;
//        for(NaryNode child:root.children){
//            if(dfs(child,target)) return true;
//        }
//        return false;
//    }
//    public boolean isSubtree(NaryNode root,NaryNode target){
//        if(root.val!=target.val) return false;
//        int rSize=root.children.size();
//        int tSize=target.children.size();
//        if(rSize!=tSize) return false;
//        for (int i = 0; i < rSize; i++) {
//            if(!isSubtree(root.children.get(i),target.children.get(i))) return false;
//        }
//        return true;
//    }
//}
