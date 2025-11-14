package CodeForces;

import java.util.Scanner;

public class Vladandshapes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            String[][] arr=new String[n][1];
            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < 1; j++) {
                    arr[i][0]= sc.next();
//                }
            }
            int l=-1;
            int u=-1;
            int i=0;
            int j=0;
            boolean t=false;
            for (i= 0; i < n; i++) {
//                for (j = 0; j < 1; j++) {
                    for (int k = 0; k < n; k++) {
                        if(arr[i][0].charAt(k)=='1') l=(l==-1)?k:l;
                        if(arr[i][0].charAt(k)=='1') u=k;
//                    }

                }
                if(l!=-1 && u!=-1){
                    break;
                }
            }

            if(l!=-1 && u!=-1){
                i++;
                int nl=-1;
                int nu=-1;
                for (j = 0; j < n; j++) {
                    if(arr[i][0].charAt(j)=='1') nl=(nl==-1)?j:nl;
                    if(arr[i][0].charAt(j)=='1') nu=j;
                }
                if(l!=nl && u!=nu){
                    t=true;
                }
//                for(j=l;j<=u;j++) {
//                    if(arr[i][j]!=1){
//                        t=true;
//                        break;
//                    }
//                }
            }
            if(t) System.out.println("TRIANGLE");
            else System.out.println("SQUARE");
        }
    }
}
