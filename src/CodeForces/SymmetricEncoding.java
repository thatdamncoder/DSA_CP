package CodeForces;

import java.util.*;

public class SymmetricEncoding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            List<Character> list=new ArrayList<>();
            for(char ch:s.toCharArray()){
                if(!list.contains(ch)) list.add(ch);
            }
            Collections.sort(list);
            Map<Character,Character> map=new HashMap<>();
            for(int i=0;i<=list.size()/2;i++){
                map.put(list.get(i),list.get(list.size()-i-1));
                map.put(list.get(list.size()-i-1),list.get(i));
            }
            char[] ans=new char[n];
            for (int i = 0; i < n; i++) {
                ans[i]=map.get(s.charAt(i));
            }
            System.out.println(new String(ans));
        }

    }
}
