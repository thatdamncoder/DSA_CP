package RandomTry;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        int n=7;
        boolean ok=true;
        int[] arr={1,2,3,4,5,6,7};
        for (int i = 1; i < n && ok; i++) {
            if(arr[i-1]>arr[i]) ok=false;
        }
        System.out.println(ok?"YES":"NO");
    }
}
