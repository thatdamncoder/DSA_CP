package CodeForces;


import java.util.*;


public class EraseFirstSecondLetter {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
//            count = 1;
//            StringBuilder sb = new StringBuilder(s);
//            Set<StringBuilder> set = new HashSet<>();
//            recurse(sb, set, n);
            Set<String> set = new HashSet<>();
            rec2(s,set);
            System.out.println(1+set.size());
        }
    }
    static void rec(String s,Set<String> set){
        if(s.length()==1) return;
        if(s.charAt(0)==s.charAt(1)){
            set.add(s.substring(1));
            rec(s.substring(1),set);
            return;
        }
        String a=s.substring(1);
        String b=s.charAt(0)+ s.substring(2);
        if(set.add(a))rec(a,set);
        if(set.add(b))rec(b,set);
    }
//    static void recurse(StringBuilder sb,Set<StringBuilder> set,int sn){
//        System.out.println(sb);
//        if(sb.length()<2) return;
//        if(set.contains(sb)) {
//            return;
//        }
//        if(!set.contains(sb) && sb.length()!=sn) {
////            System.out.println(sb);
//            set.add(sb);
//            count++;
//        }
////        StringBuilder rz=sb.deleteCharAt(0);
////        if(!sb.isEmpty())
////            recurse(new StringBuilder(sb.deleteCharAt(0)),set,sn);
//////        StringBuilder ro=sb.deleteCharAt(1);
////        if(sb.length()!=1)
////            recurse(new StringBuilder(sb.deleteCharAt(1)),set,sn);
//        if (!sb.isEmpty()) recurse(new StringBuilder(sb.substring(1)), set, sn);
//        if (sb.length() >= 2) recurse(new StringBuilder(sb.substring(0, 1) + sb.substring(2)), set, sn);
//    }
    static void rec2(String initial, Set<String> set) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(initial);

        while (!queue.isEmpty()) {
            String s = queue.poll();
            if (s.length() <= 1) continue;

            String nextString = s.substring(1);
            if (set.add(nextString)) {
                queue.offer(nextString);
            }
            if (s.charAt(0) != s.charAt(1)) {
                String a = s.charAt(0) + s.substring(2);
                if (set.add(a)) {
                    queue.offer(a);
                }
            }
        }
    }
}
