package AOALab;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(bsearch(arr,3));
    }
    public static int bsearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
