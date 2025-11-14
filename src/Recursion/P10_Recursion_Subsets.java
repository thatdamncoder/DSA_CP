package Recursion;

import java.util.ArrayList;
import java.util.List;

public class P10_Recursion_Subsets {
    public static void main(String[] args) {
        int[] arr={1,2,2};
//        List<List<Integer>> ans= subsetArray(arr);
//        for(List<Integer> list:ans){
//            System.out.println(list);
//        }
        List<List<Integer>> ans2= subsetArrayDuplicate(arr);
        for(List<Integer> list:ans2){
            System.out.println(list);
        }
    }

                                        //ITERATIVE APPROACH//

    static List<List<Integer>> subsetArray(int[] arr){

        List<List<Integer>> outerlist=new ArrayList<>();

        outerlist.add(new ArrayList<>());   //adding empty list

        for (int num:arr) {
            int n=outerlist.size();
            //POINT TO BE NOTED-if I directly write i<outerlist.size() it will give heap OutOfMemoryError
            for (int i = 0; i < n; i++) {
                //creating copy of the inner lists available and adding the next element in each of them
                List<Integer> innerlist=new ArrayList<>(outerlist.get(i));
                innerlist.add(num);
                outerlist.add(innerlist);
            }
        }
        return outerlist;
    }
    static List<List<Integer>> subsetArrayDuplicate(int[] arr){

        List<List<Integer>> outerlist=new ArrayList<>();

        outerlist.add(new ArrayList<>());   //adding empty list

        for (int num:arr) {
            int n=outerlist.size();
            //POINT TO BE NOTED-if I directly write i<outerlist.size() it will give heap OutOfMemoryError
            for (int i = 0; i < n; i++) {
                //creating copy of the inner lists available and adding the next element in each of them
                List<Integer> innerlist=new ArrayList<>(outerlist.get(i));
                innerlist.add(num);
                if(!outerlist.contains(innerlist)) {
                    outerlist.add(innerlist);
                }
            }
        }
        return outerlist;
    }
}
