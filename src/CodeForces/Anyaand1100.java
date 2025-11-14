package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anyaand1100 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            String s=sc.next();
            int m=s.length();
            char[] arr=s.toCharArray();
            int n=sc.nextInt();
            int[][] q=new int[n][2];
            for (int i = 0; i < n; i++) {
                q[i][0]=sc.nextInt();
                q[i][1]=sc.nextInt();
            }
            Set<Integer> set=new HashSet<>();
            for(int i=0;i+4<=m;i++){
                if(s.substring(i,i+4).equals("1100")){
                    set.add(i);
                }
            }
            for (int i = 0; i < n; i++) {
                int ind=q[i][0]-1; int rep=q[i][1];
                for(int k=0;k<=3;k++){
                    set.remove(ind-k);
                }
                arr[ind]='0';
                if(arr[ind]=='0'){
                    if(ind-2>=0 && ind+2<=m){
                        if(new String(arr,ind-2,4).equals("1100")){
                            set.add(ind-2);
                        }
                    }
                    if(ind-3>=0 && ind+1<=m){
                        if(new String(arr,ind-3,4).equals("1100")){
                            set.add(ind-3);
                        }
                    }
                }else{
                    if(ind+4<=m){
                        if(new String(arr,ind,4).equals("1100")){
                            set.add(ind);
                        }
                    }
                    if(ind-1>=0 && ind+3<=m){
                        if(new String(arr,ind-1,4).equals("1100")){
                            set.add(ind-1);
                        }
                    }
                }
                System.out.println(set.isEmpty()?"NO":"YES");

            }

        }
    }
}
