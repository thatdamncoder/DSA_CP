package AOALab;

import java.util.*;

public class CDLabFirst {

    public static void main(String[] args) {
        Map<Character, List<String>> map=new HashMap<>();
        Map<Character, List<String>> ans=new HashMap<>();
        boolean[] visited=new boolean[26];
        createList(map,ans);
        for(Character key: map.keySet()){
            if(!visited[key-'A']) dfs1(key,map,ans,visited);
        }
        for(Character key: ans.keySet()){
            System.out.println(key + "-> " +ans.get(key));
        }
    }
    public static void createList(Map<Character, List<String>> map,Map<Character, List<String>> ans){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total non-terminals");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter non-terminal");
            char ch=sc.next().charAt(0);
            map.put(ch,new ArrayList<>());
            ans.put(ch,new ArrayList<>());
            System.out.println("Enter total production rules for " + ch);
            int n1=sc.nextInt();
            for (int j = 0; j < n1; j++) {
                String s=sc.next();
                map.get(ch).add(s);
            }
        }

    }
    public static void dfs1(char s,Map<Character, List<String>> map,Map<Character, List<String>> ans,boolean[] visited){
        if(visited[s-'A']) return;
        visited[s-'A']=true;
        for(String adjNode:map.get(s)){
            int epsilon=0;
            for (int i = 0; i < adjNode.length(); i++) {
                int ok=0;
                char ch=adjNode.charAt(i);
                if(ch=='$') {
                    ans.get(s).add("$");
                    epsilon=1;
                    break;
                }
                else if(ch-'a'>=0 && ch-'a'<=25){
                    if(!ans.containsKey(ch)) ans.put(ch, List.of(ch + ""));
                    ans.get(s).add(ch+"");
                    epsilon=1;
                    break;
                }
                else{
                    dfs1(ch,map,ans,visited);
                    for(String first:ans.get(ch)){
                        if(first.charAt(0)!='$') {
                            ans.get(s).add(first);
                        }
                        else ok=1;
                    }
                }

                if(ok==0){
                    epsilon=1;
                    break;
                }
            }
            if(epsilon==0){
                ans.get(s).add("$");
            }
        }


    }
}
