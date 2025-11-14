package NPTELDAA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SMSDictionary {
    static int[] count=new int[26];
    static boolean computed=false;
    public static void main(String[] args){
        if(!computed){
            computed=true;
            compute();
        }
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num--!=0){
            int n=sc.nextInt();
            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.next();
            }
            String ans="";
            Map<String,Integer> map=new HashMap<>();
            int max=0;
            for(String s:arr){
                String a="";
                for(char ch:s.toCharArray()) a+=count[ch-'a'];
                map.put(a,map.getOrDefault(a,0)+1);
                if(map.get(a)>max){
                    max=map.get(a);
                    ans=a;
                }
            }
            System.out.println(ans);
        }
    }
    public static void compute(){
        int c=2;
        for(int i=0;i<26;){
            for(int j=0;j<3 && i<26;j++){
                count[i]=c;
                i++;
            }
            if((i+1<26) && (c==7 || c==9)) count[++i]=c;
            c++;
        }
    }
}
