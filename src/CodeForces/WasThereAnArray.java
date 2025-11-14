import java.util.Arrays;
import java.util.Scanner;

public class WasThereAnArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt()-2;
            int[] b=new int[n];
            for (int i = 0; i < n; i++) {
                b[i]= sc.nextInt();
            }
            int[] a=new int[n+2];
            a[0]=1;
            boolean ok=true;
            for (int i = 0; i < n; i++) {
                int in=i+1;
                if(b[i]==1){
                    if(a[in]==0) a[in]=a[in-1];
                    if(a[in+1]==0) a[in+1]=a[in];
                }
                else{
                    if(a[in]!=0){
                        if(a[in-1]==a[in]){
                            a[in+1]=a[in]+1;
                        }
                    } else a[in]=a[in-1]+1;
                }
            }
            if(a[a.length-1]==0) {
//                System.out.println("caught");
                a[n+2-1]=a[n+2-2]+1;
                if(b[n-1]==1) a[n+2-1]--;
            }
            //System.out.println(Arrays.toString(a));
            for (int i = 0; i< n && ok; i++) {
                if(b[i]==1){
                    if(!(a[i]==a[i+1] && a[i+1]==a[i+2])) ok=false;
                }
                else if(a[i]==a[i+1] && a[i+1]==a[i+2]) ok=false;
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}