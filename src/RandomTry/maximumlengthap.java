//package RandomTry;
//
//public class maximumlengthap {
//    public static void main(String[] args) {
//            int n = arr.length;
//            if (n <= 1) {
//                return n;
//            }
//
//            int max = 0;
//            int count = 1;
//            int diff = Integer.MAX_VALUE;
//
//            for (int i = 1; i < n; i++) {
//                if (diff==Integer.MAX_VALUE || arr[i] - arr[i - 1] == diff) {
//                    if(diff==Integer.MAX_VALUE) diff=arr[i]-arr[i-1];
//                    count++;
//
//                } else {
//                    diff = arr[i] - arr[i - 1];
//                    max = Math.max(max, count);
//                    count = 1;
//                }
//            }
//            max = Math.max(max, count);
//            return max;
//        }
//
//        public static void main(String[] args) {
//            int[] arr = { 1, 5, 7, 9, 11, 13, 15, 17 };
//
//            int result = maxLengthAP(arr);
//
//            System.out.println("The maximum length of a consecutive subarray forming an AP is: " + result);
//        }
//    }
//
//}
