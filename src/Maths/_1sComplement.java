package Maths;

public class _1sComplement {
    public static void main(String[] args) {
        int i=5;
        System.out.println((1<<31) + ~i);
        System.out.println(xor(i));
    }
    public static int xor(int i){
        for (int j = 0; j < 32; j++) {
            i=(i>>j)^1;
        }
        return i;
    }
}
