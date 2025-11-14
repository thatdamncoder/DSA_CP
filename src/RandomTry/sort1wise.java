package RandomTry;

import java.util.Arrays;

public class sort1wise {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sort(arr)));

    }
    static int[] bubblesort(int[] count ,int[] arr) {
        for (int i = 0; i < count.length; i++) {
            int j = i;
            while (j != count.length - 1) {
                if(count[j]>count[j+1] || (count[j]==count[j+1] && arr[j]>arr[j+1])){
                    int tempCount = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = tempCount;

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                j++;
            }
        }
        return arr;
    }
    static int[] sort(int[] arr){
        int[] count=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            while(n!=0){
                n=n&(n-1);
                n=n>>1;
                count[i]++;
            }
        }

        return bubblesort(count,arr);

    }
}
