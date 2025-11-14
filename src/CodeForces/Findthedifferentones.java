package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Findthedifferentones {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n; i++) {
                arr[i]=sc.nextInt();
            }
            int q=sc.nextInt();
//            int[][] que=new int[q][2];
//            for (int i = 0; i < q; i++) {
//                que[i][0]=sc.nextInt();
//                que[i][1]=sc.nextInt();
//            }
//            int[][] ans=new int[q][2];
            for (int i = 0; i < q; i++) {
//                int l=que[i][0]-1;
//                int r=que[i][1]-1;
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                if(arr[l]!=arr[r]){
                    System.out.println((l+1) + " " + (r+1));
                }
                else if(r-l==1){
                    System.out.println(arr[l]==arr[r]?"-1 -1":(l+1)+" "+(r+1));
                }
                else{
                    Set<Integer> set=new HashSet<>();
                    int save=0;
                    boolean found=false;
                    for (int j = l; j <=r ; j++) {
                        if(set.isEmpty()) {
                            save=j;
                            set.add(arr[j]);
                        }
                        else set.add(arr[j]);
                        if(set.size()==2){
                            System.out.println((j+1) + " " + (save+1));
                            found=true;
                            break;
                        }
                    }
                    if(!found) System.out.println("-1 -1");
                }
            }
            System.out.println();
        }
    }
}
