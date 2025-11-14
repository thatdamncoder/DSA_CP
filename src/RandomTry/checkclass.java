package RandomTry;

public class checkclass {
    static class try1{
        int[] arr;
        public try1(int n){
            arr=new int[n];
        }
        public int getSize(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        try1 obj1=new try1(1);
        System.out.println(obj1.getSize());

    }
}

