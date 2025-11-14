package Trees;


import java.util.*;

public class P01_Trees_Basics {
    public static void main(String[] args) {
        binarysearchtrees();
    }

    static void trees(){
        P01_Trees_Class tree= new P01_Trees_Class();
        Scanner scanner = new Scanner(System.in);
        tree.insertNode(scanner);
        tree.display();
//        System.out.println(tree.minnode());
//        for (List<Integer> list: tree.anyPathEqualsSum(4)) {
//            System.out.println(list);
//        }
        tree.rootToLeaf3Main(3);
//        tree.preorder();
//        tree.inorder();
//        tree.postorder();
    }
    static void binarysearchtrees(){
        P02_BST_Class bst= new P02_BST_Class();
//        bst.insertSortedArray(new int[]  {1,2,3,4,5,6,7,8,9,10},0,10);
        bst.populate(new int[] {4,2,5,7,1,3,6,1,0,8});
        bst.display();
//        System.out.println(bst.leftMostLine());
//        System.out.println(Arrays.toString(bst.mineithersides()));
//        System.out.println(bst.sum(9));
//        for (List<Integer> list: bst.check()) {
//            System.out.println(list);
//        }

//        bst.search(5);
//        bst.bfs();
//        System.out.println(bst.isbalanced());
//        System.out.println(bst.noofNodes());
//        System.out.println(bst.nextsuccessor(5));
//        System.out.println(Math.ceil(4));
    }
    static void avltree(){
        P03_AVL_Class avl=new P03_AVL_Class();
//        for (int i = 0; i < 1000; i++) {
//            avl.insert(i);
//        }
//        int[] nums={2,2,5,5,7};
//        avl.populate(nums);
        System.out.println(avl.height());
    }
    static void segmenttrees(){
        int[] arr={3,8,7,6,-2,-8,4,9};
        P04_Segment_Class segment=new P04_Segment_Class(arr);
        segment.display();
//        System.out.println(segment.sum(2,2));
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        segment.update(3,14);
        segment.display();
    }
}
