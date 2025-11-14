package CodeForces;

import java.util.*;

public class ThreeActivities2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int[] c=new int[n];
            for(int i=0;i<3;i++){
                for(int j=0;j<n;j++){
                    if(i==0) a[j]=sc.nextInt();
                    if(i==1) b[j]=sc.nextInt();
                    if(i==2) c[j]=sc.nextInt();
                }
            }
            int[] x=getThreeMax(a);
            int[] y=getThreeMax(b);
            int[] z=getThreeMax(c);
            int max=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){
                        if(x[i]!=y[j] && y[j]!=z[k] && x[i]!=z[k]){
                            max=Math.max(max,a[x[i]]+b[y[j]]+c[z[k]]);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
    static int[] getThreeMax(int[] arr){
        int max=-1;
        int secmax=-1;
        int thirdmax=-1;
        int[] ans=new int[3];

        for(int i=0;i<arr.length;i++){
            if(max==-1 || arr[i]>arr[max]){
                thirdmax=secmax;
                secmax=max;
                max=i;
            }
            else if(secmax==-1 || arr[i]>arr[secmax]){
                thirdmax=secmax;
                secmax=i;
            }
            else if(thirdmax==-1 || arr[i]>arr[thirdmax]){
                thirdmax=i;
            }
        }
        ans[0]=max;
        ans[1]=secmax;
        ans[2]=thirdmax;
        return ans;
    }
}
